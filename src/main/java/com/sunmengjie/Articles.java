package com.sunmengjie;

import java.io.Serializable;
import java.util.Date;

public class Articles implements Serializable{

	private Integer id;
	private String title;	//标题
	private String content;	//文章的内容
	private String picture;	//图片的url
	private int channelId;	//栏目 频道
	private int categoryId; //分类
	private int userId;
	private int hits; 		//点击数量
	private int hot ;		//是否热门
	private Integer status;		//文章的状态  0 ，待审核    1 审核通过   2 拒绝 
	private int deleted; 	// 是否被删除
	private Date created; 	//创建时间
	private Date updated; 	// 最后的修改时间
	private int commentCnt;   // 评论数量
	private int articleType;  // 文章的类型 文字0     图片  1  
	
	private int complainCnt;
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}





	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getChannelId() {
		return channelId;
	}


	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getHits() {
		return hits;
	}


	public void setHits(int hits) {
		this.hits = hits;
	}


	public int getHot() {
		return hot;
	}





	public void setHot(int hot) {
		this.hot = hot;
	}





	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}


	public void setUpdated(Date updated) {
		this.updated = updated;
	}


	public int getCommentCnt() {
		return commentCnt;
	}


	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}


	public int getArticleType() {
		return articleType;
	}


	public void setArticleType(int articleType) {
		this.articleType = articleType;
	}


	public int getComplainCnt() {
		return complainCnt;
	}

	public void setComplainCnt(int complainCnt) {
		this.complainCnt = complainCnt;
	}


	@Override
	public String toString() {
		return "Articles [id=" + id + ", title=" + title + ", content=" + content + ", picture=" + picture
				+ ", channelId=" + channelId + ", categoryId=" + categoryId + ", userId=" + userId + ", hits=" + hits
				+ ", hot=" + hot + ", status=" + status + ", deleted=" + deleted + ", created=" + created + ", updated="
				+ updated + ", commentCnt=" + commentCnt + ", articleType=" + articleType + ", complainCnt="
				+ complainCnt + "]";
	}
	
	
	
	
	
	
	
}
