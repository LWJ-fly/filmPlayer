package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscussionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscussionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDiscussionidIsNull() {
            addCriterion("discussionId is null");
            return (Criteria) this;
        }

        public Criteria andDiscussionidIsNotNull() {
            addCriterion("discussionId is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussionidEqualTo(Integer value) {
            addCriterion("discussionId =", value, "discussionid");
            return (Criteria) this;
        }

        public Criteria andDiscussionidNotEqualTo(Integer value) {
            addCriterion("discussionId <>", value, "discussionid");
            return (Criteria) this;
        }

        public Criteria andDiscussionidGreaterThan(Integer value) {
            addCriterion("discussionId >", value, "discussionid");
            return (Criteria) this;
        }

        public Criteria andDiscussionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("discussionId >=", value, "discussionid");
            return (Criteria) this;
        }

        public Criteria andDiscussionidLessThan(Integer value) {
            addCriterion("discussionId <", value, "discussionid");
            return (Criteria) this;
        }

        public Criteria andDiscussionidLessThanOrEqualTo(Integer value) {
            addCriterion("discussionId <=", value, "discussionid");
            return (Criteria) this;
        }

        public Criteria andDiscussionidIn(List<Integer> values) {
            addCriterion("discussionId in", values, "discussionid");
            return (Criteria) this;
        }

        public Criteria andDiscussionidNotIn(List<Integer> values) {
            addCriterion("discussionId not in", values, "discussionid");
            return (Criteria) this;
        }

        public Criteria andDiscussionidBetween(Integer value1, Integer value2) {
            addCriterion("discussionId between", value1, value2, "discussionid");
            return (Criteria) this;
        }

        public Criteria andDiscussionidNotBetween(Integer value1, Integer value2) {
            addCriterion("discussionId not between", value1, value2, "discussionid");
            return (Criteria) this;
        }

        public Criteria andMainuseridIsNull() {
            addCriterion("mainUserId is null");
            return (Criteria) this;
        }

        public Criteria andMainuseridIsNotNull() {
            addCriterion("mainUserId is not null");
            return (Criteria) this;
        }

        public Criteria andMainuseridEqualTo(Integer value) {
            addCriterion("mainUserId =", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridNotEqualTo(Integer value) {
            addCriterion("mainUserId <>", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridGreaterThan(Integer value) {
            addCriterion("mainUserId >", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("mainUserId >=", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridLessThan(Integer value) {
            addCriterion("mainUserId <", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridLessThanOrEqualTo(Integer value) {
            addCriterion("mainUserId <=", value, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridIn(List<Integer> values) {
            addCriterion("mainUserId in", values, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridNotIn(List<Integer> values) {
            addCriterion("mainUserId not in", values, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridBetween(Integer value1, Integer value2) {
            addCriterion("mainUserId between", value1, value2, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andMainuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("mainUserId not between", value1, value2, "mainuserid");
            return (Criteria) this;
        }

        public Criteria andFilmtitleIsNull() {
            addCriterion("filmTitle is null");
            return (Criteria) this;
        }

        public Criteria andFilmtitleIsNotNull() {
            addCriterion("filmTitle is not null");
            return (Criteria) this;
        }

        public Criteria andFilmtitleEqualTo(String value) {
            addCriterion("filmTitle =", value, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleNotEqualTo(String value) {
            addCriterion("filmTitle <>", value, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleGreaterThan(String value) {
            addCriterion("filmTitle >", value, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleGreaterThanOrEqualTo(String value) {
            addCriterion("filmTitle >=", value, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleLessThan(String value) {
            addCriterion("filmTitle <", value, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleLessThanOrEqualTo(String value) {
            addCriterion("filmTitle <=", value, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleLike(String value) {
            addCriterion("filmTitle like", value, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleNotLike(String value) {
            addCriterion("filmTitle not like", value, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleIn(List<String> values) {
            addCriterion("filmTitle in", values, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleNotIn(List<String> values) {
            addCriterion("filmTitle not in", values, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleBetween(String value1, String value2) {
            addCriterion("filmTitle between", value1, value2, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andFilmtitleNotBetween(String value1, String value2) {
            addCriterion("filmTitle not between", value1, value2, "filmtitle");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andFilmcountIsNull() {
            addCriterion("filmCount is null");
            return (Criteria) this;
        }

        public Criteria andFilmcountIsNotNull() {
            addCriterion("filmCount is not null");
            return (Criteria) this;
        }

        public Criteria andFilmcountEqualTo(Integer value) {
            addCriterion("filmCount =", value, "filmcount");
            return (Criteria) this;
        }

        public Criteria andFilmcountNotEqualTo(Integer value) {
            addCriterion("filmCount <>", value, "filmcount");
            return (Criteria) this;
        }

        public Criteria andFilmcountGreaterThan(Integer value) {
            addCriterion("filmCount >", value, "filmcount");
            return (Criteria) this;
        }

        public Criteria andFilmcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("filmCount >=", value, "filmcount");
            return (Criteria) this;
        }

        public Criteria andFilmcountLessThan(Integer value) {
            addCriterion("filmCount <", value, "filmcount");
            return (Criteria) this;
        }

        public Criteria andFilmcountLessThanOrEqualTo(Integer value) {
            addCriterion("filmCount <=", value, "filmcount");
            return (Criteria) this;
        }

        public Criteria andFilmcountIn(List<Integer> values) {
            addCriterion("filmCount in", values, "filmcount");
            return (Criteria) this;
        }

        public Criteria andFilmcountNotIn(List<Integer> values) {
            addCriterion("filmCount not in", values, "filmcount");
            return (Criteria) this;
        }

        public Criteria andFilmcountBetween(Integer value1, Integer value2) {
            addCriterion("filmCount between", value1, value2, "filmcount");
            return (Criteria) this;
        }

        public Criteria andFilmcountNotBetween(Integer value1, Integer value2) {
            addCriterion("filmCount not between", value1, value2, "filmcount");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andUesravatarIsNull() {
            addCriterion("uesrAvatar is null");
            return (Criteria) this;
        }

        public Criteria andUesravatarIsNotNull() {
            addCriterion("uesrAvatar is not null");
            return (Criteria) this;
        }

        public Criteria andUesravatarEqualTo(String value) {
            addCriterion("uesrAvatar =", value, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarNotEqualTo(String value) {
            addCriterion("uesrAvatar <>", value, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarGreaterThan(String value) {
            addCriterion("uesrAvatar >", value, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarGreaterThanOrEqualTo(String value) {
            addCriterion("uesrAvatar >=", value, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarLessThan(String value) {
            addCriterion("uesrAvatar <", value, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarLessThanOrEqualTo(String value) {
            addCriterion("uesrAvatar <=", value, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarLike(String value) {
            addCriterion("uesrAvatar like", value, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarNotLike(String value) {
            addCriterion("uesrAvatar not like", value, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarIn(List<String> values) {
            addCriterion("uesrAvatar in", values, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarNotIn(List<String> values) {
            addCriterion("uesrAvatar not in", values, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarBetween(String value1, String value2) {
            addCriterion("uesrAvatar between", value1, value2, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUesravatarNotBetween(String value1, String value2) {
            addCriterion("uesrAvatar not between", value1, value2, "uesravatar");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}