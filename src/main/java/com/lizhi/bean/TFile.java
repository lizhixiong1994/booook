package com.lizhi.bean;


public class TFile {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file.file_id
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    private Integer fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file.file_url
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    private String fileUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file.file_type
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    private String fileType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file.md5
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    private String md5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_file.creator_userid
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    private Integer creatorUserid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file.file_id
     *
     * @return the value of t_file.file_id
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file.file_id
     *
     * @param fileId the value for t_file.file_id
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file.file_url
     *
     * @return the value of t_file.file_url
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file.file_url
     *
     * @param fileUrl the value for t_file.file_url
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file.file_type
     *
     * @return the value of t_file.file_type
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file.file_type
     *
     * @param fileType the value for t_file.file_type
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file.md5
     *
     * @return the value of t_file.md5
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public String getMd5() {
        return md5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file.md5
     *
     * @param md5 the value for t_file.md5
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_file.creator_userid
     *
     * @return the value of t_file.creator_userid
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public Integer getCreatorUserid() {
        return creatorUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_file.creator_userid
     *
     * @param creatorUserid the value for t_file.creator_userid
     *
     * @mbg.generated Sun Jul 08 21:07:30 CST 2018
     */
    public void setCreatorUserid(Integer creatorUserid) {
        this.creatorUserid = creatorUserid;
    }
}