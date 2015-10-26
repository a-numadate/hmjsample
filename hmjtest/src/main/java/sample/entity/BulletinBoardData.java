//package sample.entity;
//
//import java.sql.Timestamp;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
////このクラスはEntityとして登録しますよ、とspringに教えてます
//@Entity
//@Table(name="bulletin_board_data")
//public class BulletinBoardData {
//
//    @Id // プライマリーキーのものに設定してください
//    @GeneratedValue(strategy=GenerationType.IDENTITY) //　主に数字に対して、順番に一意に設定しますよ、の意味
//    protected Integer id;
//
//    @Column //　ただの変数じゃなくて、DBのカラムだよ、の意味 これがないとDBから値を取得したときに、「設定するカラムがない！」と怒られるらしい
//    protected String name;
//
//    @Column
//    protected Timestamp postingDate;
//
//    @Column
//    protected String postingContent;
//
//    @Column
//    protected Timestamp registerDate;
//
//    @Column
//    protected Timestamp updateDate;
//
//    // コンストラクタ
//    public BulletinBoardData() {
//        super();
//    }
//
//    // setter & getter ---------------------
//    // setterがないと、DBから値を取得した際に設定できないらしい
//
//    /**
//     * idを返却
//     *
//     * @return id
//     */
//    public Integer getId() {
//        return id;
//    }
//
//    /**
//     * idを設定
//     *
//     * @param id
//     */
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    /**
//     * nameを返却
//     *
//     * @return name
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * nameを設定
//     *
//     * @param name
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    /**
//     * postingDateを返却
//     *
//     * @return postingDate
//     */
//    public Timestamp getPostingDate() {
//        return postingDate;
//    }
//
//    /**
//     * postingDateを設定
//     *
//     * @param postingDate
//     */
//    public void setPostingDate(Timestamp postingDate) {
//        this.postingDate = postingDate;
//    }
//
//    /**
//     * postingContentを返却
//     *
//     * @return postingContent
//     */
//    public String getPostingContent() {
//        return postingContent;
//    }
//
//    /**
//     * postingContentを設定
//     *
//     * @param postingContent
//     */
//    public void setPostingContent(String postingContent) {
//        this.postingContent = postingContent;
//    }
//
//    /**
//     * registerDateを返却
//     *
//     * @return registerDate
//     */
//    public Timestamp getRegisterDate() {
//        return registerDate;
//    }
//
//    /**
//     * registerDateを設定
//     *
//     * @param registerDate
//     */
//    public void setRegisterDate(Timestamp registerDate) {
//        this.registerDate = registerDate;
//    }
//
//    /**
//     * updateDateを返却
//     *
//     * @return updateDate
//     */
//    public Timestamp getUpdateDate() {
//        return updateDate;
//    }
//
//    /**
//     * updateDateを設定
//     *
//     * @param updateDate
//     */
//    public void setUpdateDate(Timestamp updateDate) {
//        this.updateDate = updateDate;
//    }
//
//}
