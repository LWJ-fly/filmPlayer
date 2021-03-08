package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andCommentsidIsNull() {
            addCriterion("commentsId is null");
            return (Criteria) this;
        }

        public Criteria andCommentsidIsNotNull() {
            addCriterion("commentsId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsidEqualTo(Integer value) {
            addCriterion("commentsId =", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidNotEqualTo(Integer value) {
            addCriterion("commentsId <>", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidGreaterThan(Integer value) {
            addCriterion("commentsId >", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentsId >=", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidLessThan(Integer value) {
            addCriterion("commentsId <", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidLessThanOrEqualTo(Integer value) {
            addCriterion("commentsId <=", value, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidIn(List<Integer> values) {
            addCriterion("commentsId in", values, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidNotIn(List<Integer> values) {
            addCriterion("commentsId not in", values, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidBetween(Integer value1, Integer value2) {
            addCriterion("commentsId between", value1, value2, "commentsid");
            return (Criteria) this;
        }

        public Criteria andCommentsidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentsId not between", value1, value2, "commentsid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andMoveidIsNull() {
            addCriterion("moveId is null");
            return (Criteria) this;
        }

        public Criteria andMoveidIsNotNull() {
            addCriterion("moveId is not null");
            return (Criteria) this;
        }

        public Criteria andMoveidEqualTo(Integer value) {
            addCriterion("moveId =", value, "moveid");
            return (Criteria) this;
        }

        public Criteria andMoveidNotEqualTo(Integer value) {
            addCriterion("moveId <>", value, "moveid");
            return (Criteria) this;
        }

        public Criteria andMoveidGreaterThan(Integer value) {
            addCriterion("moveId >", value, "moveid");
            return (Criteria) this;
        }

        public Criteria andMoveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moveId >=", value, "moveid");
            return (Criteria) this;
        }

        public Criteria andMoveidLessThan(Integer value) {
            addCriterion("moveId <", value, "moveid");
            return (Criteria) this;
        }

        public Criteria andMoveidLessThanOrEqualTo(Integer value) {
            addCriterion("moveId <=", value, "moveid");
            return (Criteria) this;
        }

        public Criteria andMoveidIn(List<Integer> values) {
            addCriterion("moveId in", values, "moveid");
            return (Criteria) this;
        }

        public Criteria andMoveidNotIn(List<Integer> values) {
            addCriterion("moveId not in", values, "moveid");
            return (Criteria) this;
        }

        public Criteria andMoveidBetween(Integer value1, Integer value2) {
            addCriterion("moveId between", value1, value2, "moveid");
            return (Criteria) this;
        }

        public Criteria andMoveidNotBetween(Integer value1, Integer value2) {
            addCriterion("moveId not between", value1, value2, "moveid");
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

        public Criteria andTextvalueIsNull() {
            addCriterion("textValue is null");
            return (Criteria) this;
        }

        public Criteria andTextvalueIsNotNull() {
            addCriterion("textValue is not null");
            return (Criteria) this;
        }

        public Criteria andTextvalueEqualTo(String value) {
            addCriterion("textValue =", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueNotEqualTo(String value) {
            addCriterion("textValue <>", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueGreaterThan(String value) {
            addCriterion("textValue >", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueGreaterThanOrEqualTo(String value) {
            addCriterion("textValue >=", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueLessThan(String value) {
            addCriterion("textValue <", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueLessThanOrEqualTo(String value) {
            addCriterion("textValue <=", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueLike(String value) {
            addCriterion("textValue like", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueNotLike(String value) {
            addCriterion("textValue not like", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueIn(List<String> values) {
            addCriterion("textValue in", values, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueNotIn(List<String> values) {
            addCriterion("textValue not in", values, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueBetween(String value1, String value2) {
            addCriterion("textValue between", value1, value2, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueNotBetween(String value1, String value2) {
            addCriterion("textValue not between", value1, value2, "textvalue");
            return (Criteria) this;
        }

        public Criteria andFilmscoreIsNull() {
            addCriterion("filmScore is null");
            return (Criteria) this;
        }

        public Criteria andFilmscoreIsNotNull() {
            addCriterion("filmScore is not null");
            return (Criteria) this;
        }

        public Criteria andFilmscoreEqualTo(Double value) {
            addCriterion("filmScore =", value, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmscoreNotEqualTo(Double value) {
            addCriterion("filmScore <>", value, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmscoreGreaterThan(Double value) {
            addCriterion("filmScore >", value, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmscoreGreaterThanOrEqualTo(Double value) {
            addCriterion("filmScore >=", value, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmscoreLessThan(Double value) {
            addCriterion("filmScore <", value, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmscoreLessThanOrEqualTo(Double value) {
            addCriterion("filmScore <=", value, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmscoreIn(List<Double> values) {
            addCriterion("filmScore in", values, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmscoreNotIn(List<Double> values) {
            addCriterion("filmScore not in", values, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmscoreBetween(Double value1, Double value2) {
            addCriterion("filmScore between", value1, value2, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmscoreNotBetween(Double value1, Double value2) {
            addCriterion("filmScore not between", value1, value2, "filmscore");
            return (Criteria) this;
        }

        public Criteria andFilmstarsIsNull() {
            addCriterion("filmStars is null");
            return (Criteria) this;
        }

        public Criteria andFilmstarsIsNotNull() {
            addCriterion("filmStars is not null");
            return (Criteria) this;
        }

        public Criteria andFilmstarsEqualTo(Integer value) {
            addCriterion("filmStars =", value, "filmstars");
            return (Criteria) this;
        }

        public Criteria andFilmstarsNotEqualTo(Integer value) {
            addCriterion("filmStars <>", value, "filmstars");
            return (Criteria) this;
        }

        public Criteria andFilmstarsGreaterThan(Integer value) {
            addCriterion("filmStars >", value, "filmstars");
            return (Criteria) this;
        }

        public Criteria andFilmstarsGreaterThanOrEqualTo(Integer value) {
            addCriterion("filmStars >=", value, "filmstars");
            return (Criteria) this;
        }

        public Criteria andFilmstarsLessThan(Integer value) {
            addCriterion("filmStars <", value, "filmstars");
            return (Criteria) this;
        }

        public Criteria andFilmstarsLessThanOrEqualTo(Integer value) {
            addCriterion("filmStars <=", value, "filmstars");
            return (Criteria) this;
        }

        public Criteria andFilmstarsIn(List<Integer> values) {
            addCriterion("filmStars in", values, "filmstars");
            return (Criteria) this;
        }

        public Criteria andFilmstarsNotIn(List<Integer> values) {
            addCriterion("filmStars not in", values, "filmstars");
            return (Criteria) this;
        }

        public Criteria andFilmstarsBetween(Integer value1, Integer value2) {
            addCriterion("filmStars between", value1, value2, "filmstars");
            return (Criteria) this;
        }

        public Criteria andFilmstarsNotBetween(Integer value1, Integer value2) {
            addCriterion("filmStars not between", value1, value2, "filmstars");
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