package sample;

public class BulletinBoardForm {
    // 名前
    private String name;
    // 投稿内容
    private String postingContent;

    // コンストラクタ
    public BulletinBoardForm() {
        super();
    }

    // setter & getter ---------------------

    /**
     * nameを返却
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * nameを設定
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * postingContentを返却
     *
     * @return postingContent
     */
    public String getPostingContent() {
        return postingContent;
    }

    /**
     * postingContentを設定
     *
     * @param postingContent
     */
    public void setPostingContent(String postingContent) {
        this.postingContent = postingContent;
    }
}
