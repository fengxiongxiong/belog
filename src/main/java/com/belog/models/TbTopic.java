package com.belog.models;

import java.io.Serializable;

public class TbTopic implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.topic_name
     *
     * @mbggenerated
     */
    private String topicName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_topic.state
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_topic
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.id
     *
     * @return the value of tb_topic.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.id
     *
     * @param id the value for tb_topic.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.topic_name
     *
     * @return the value of tb_topic.topic_name
     *
     * @mbggenerated
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.topic_name
     *
     * @param topicName the value for tb_topic.topic_name
     *
     * @mbggenerated
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName == null ? null : topicName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_topic.state
     *
     * @return the value of tb_topic.state
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_topic.state
     *
     * @param state the value for tb_topic.state
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_topic
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", topicName=").append(topicName);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}