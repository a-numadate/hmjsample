package sample;

import java.sql.Timestamp;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sample.entity.BulletinBoardData;
import sample.repository.BulletinBoardDataRepository;

@Controller
@EnableAutoConfiguration
public class BulletinBoardController {

    @Autowired //リポジトリを紐づけする
    BulletinBoardDataRepository repository;

    @ModelAttribute // 画面で使うフォームに対応したオブジェクトを初期化して、Modelに追加する(Thymeleafからアクセスさせるために必要)
    BulletinBoardForm setupForm() {
        return new BulletinBoardForm();
    }

    /**
     * 全件取得
     *
     * DBから全データを投稿日時の降順で取得します
     *
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/bulletinBoard/serch/list", method = RequestMethod.GET)
    public String serchList(Locale locale, Model model) {

        Iterable<BulletinBoardData> list = repository.findAll(new Sort(Direction.DESC, "postingDate"));
        model.addAttribute("bulletinBoardDataList", list);

        return "bulletinBoard";
    }


    /**
     * パラメータで指定された名前のデータを検索する
     *
     * @param bulletinBoardForm フォームデータ
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/bulletinBoard/serch", method = RequestMethod.POST)
    public String serchKeyword(BulletinBoardForm bulletinBoardForm, Locale locale, Model model) {

        Iterable<BulletinBoardData> list = repository.findByName(bulletinBoardForm.getName(), new Sort(Direction.DESC, "postingDate"));
        model.addAttribute("bulletinBoardDataList", list);
        model.addAttribute("bulletinBoardForm", new BulletinBoardForm());

        return "bulletinBoard";
    }

    /**
     * 画面で入力されたデータをDBに登録して今回登録したデータを含めて全データを画面に返却する
     *
     * @param bulletinBoardForm フォームデータ
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/bulletinBoard", method = RequestMethod.POST)
    public String registReport(BulletinBoardForm bulletinBoardForm, Locale locale, Model model) {

        BulletinBoardData entity = new BulletinBoardData();
        entity.setName(bulletinBoardForm.getName());
        entity.setPostingContent(bulletinBoardForm.getPostingContent());
        entity.setPostingDate(new Timestamp(System.currentTimeMillis()));
        entity.setRegisterDate(new Timestamp(System.currentTimeMillis()));

        repository.saveAndFlush(entity);

        Iterable<BulletinBoardData> list = repository.findAll(new Sort(Direction.DESC, "postingDate"));
        model.addAttribute("bulletinBoardDataList", list);
        model.addAttribute("bulletinBoardForm", new BulletinBoardForm());

        return "bulletinBoard";
    }

}