//package sample.repository;
//
//import java.util.List;
//
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import sample.entity.BulletinBoardData;
//
///**
// * DBとEntityをつなぐ役割。
// *
// * JpaRepositoryが紐づけを行ってくれている？要確認
// * ＜＞の中身は、「＜紐づけるEntity,　プライマリーキーの型＞」
// *
// * @author a-numadate
// *
// */
//@Repository
//public interface BulletinBoardDataRepository extends JpaRepository<BulletinBoardData, Integer>{
//
//    /**
//     * 指定した名前に該当するデータを検索する
//     *
//     * @param name 名前
//     * @sort ソート情報
//     * @return 該当データ(リスト)
//     */
//    public List<BulletinBoardData> findByName(String name, Sort sort);
//
//}
