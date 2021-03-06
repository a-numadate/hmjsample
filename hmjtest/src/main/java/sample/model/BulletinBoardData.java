package sample.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BulletinBoardData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin_board_data.id
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //　主に数字に対して、順番に一意に設定しますよ、の意味
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin_board_data.name
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin_board_data.posting_date
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    private Date postingDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin_board_data.posting_content
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    private String postingContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin_board_data.register_date
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    private Date registerDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bulletin_board_data.update_date
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin_board_data.id
     *
     * @return the value of bulletin_board_data.id
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin_board_data.id
     *
     * @param id the value for bulletin_board_data.id
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin_board_data.name
     *
     * @return the value of bulletin_board_data.name
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin_board_data.name
     *
     * @param name the value for bulletin_board_data.name
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin_board_data.posting_date
     *
     * @return the value of bulletin_board_data.posting_date
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public Date getPostingDate() {
        return postingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin_board_data.posting_date
     *
     * @param postingDate the value for bulletin_board_data.posting_date
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin_board_data.posting_content
     *
     * @return the value of bulletin_board_data.posting_content
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public String getPostingContent() {
        return postingContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin_board_data.posting_content
     *
     * @param postingContent the value for bulletin_board_data.posting_content
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public void setPostingContent(String postingContent) {
        this.postingContent = postingContent == null ? null : postingContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin_board_data.register_date
     *
     * @return the value of bulletin_board_data.register_date
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin_board_data.register_date
     *
     * @param registerDate the value for bulletin_board_data.register_date
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bulletin_board_data.update_date
     *
     * @return the value of bulletin_board_data.update_date
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bulletin_board_data.update_date
     *
     * @param updateDate the value for bulletin_board_data.update_date
     *
     * @mbggenerated Mon Oct 26 17:23:44 JST 2015
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}