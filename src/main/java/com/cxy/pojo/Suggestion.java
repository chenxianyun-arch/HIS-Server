package com.cxy.pojo;

import java.io.Serializable;

/**
 * (Suggestion)实体类
 *
 * @author makejava
 * @since 2021-03-22 11:21:54
 */
public class Suggestion implements Serializable {
    private static final long serialVersionUID = 794989106518244461L;
    
    private Integer suggestionId;
    
    private String suggestionType;
    
    private String suggestionContent;
    
    private String suggestionCommit;
    
    private Object suggestionTime;
    
    private Object suggestionDelete;


    public Integer getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(Integer suggestionId) {
        this.suggestionId = suggestionId;
    }

    public String getSuggestionType() {
        return suggestionType;
    }

    public void setSuggestionType(String suggestionType) {
        this.suggestionType = suggestionType;
    }

    public String getSuggestionContent() {
        return suggestionContent;
    }

    public void setSuggestionContent(String suggestionContent) {
        this.suggestionContent = suggestionContent;
    }

    public String getSuggestionCommit() {
        return suggestionCommit;
    }

    public void setSuggestionCommit(String suggestionCommit) {
        this.suggestionCommit = suggestionCommit;
    }

    public Object getSuggestionTime() {
        return suggestionTime;
    }

    public void setSuggestionTime(Object suggestionTime) {
        this.suggestionTime = suggestionTime;
    }

    public Object getSuggestionDelete() {
        return suggestionDelete;
    }

    public void setSuggestionDelete(Object suggestionDelete) {
        this.suggestionDelete = suggestionDelete;
    }

}