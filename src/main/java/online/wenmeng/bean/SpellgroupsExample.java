package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpellgroupsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpellgroupsExample() {
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

        public Criteria andSpellgroupidIsNull() {
            addCriterion("spellGroupId is null");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidIsNotNull() {
            addCriterion("spellGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidEqualTo(Integer value) {
            addCriterion("spellGroupId =", value, "spellgroupid");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidNotEqualTo(Integer value) {
            addCriterion("spellGroupId <>", value, "spellgroupid");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidGreaterThan(Integer value) {
            addCriterion("spellGroupId >", value, "spellgroupid");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spellGroupId >=", value, "spellgroupid");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidLessThan(Integer value) {
            addCriterion("spellGroupId <", value, "spellgroupid");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("spellGroupId <=", value, "spellgroupid");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidIn(List<Integer> values) {
            addCriterion("spellGroupId in", values, "spellgroupid");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidNotIn(List<Integer> values) {
            addCriterion("spellGroupId not in", values, "spellgroupid");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidBetween(Integer value1, Integer value2) {
            addCriterion("spellGroupId between", value1, value2, "spellgroupid");
            return (Criteria) this;
        }

        public Criteria andSpellgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("spellGroupId not between", value1, value2, "spellgroupid");
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

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
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

        public Criteria andRealcountIsNull() {
            addCriterion("realCount is null");
            return (Criteria) this;
        }

        public Criteria andRealcountIsNotNull() {
            addCriterion("realCount is not null");
            return (Criteria) this;
        }

        public Criteria andRealcountEqualTo(Integer value) {
            addCriterion("realCount =", value, "realcount");
            return (Criteria) this;
        }

        public Criteria andRealcountNotEqualTo(Integer value) {
            addCriterion("realCount <>", value, "realcount");
            return (Criteria) this;
        }

        public Criteria andRealcountGreaterThan(Integer value) {
            addCriterion("realCount >", value, "realcount");
            return (Criteria) this;
        }

        public Criteria andRealcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("realCount >=", value, "realcount");
            return (Criteria) this;
        }

        public Criteria andRealcountLessThan(Integer value) {
            addCriterion("realCount <", value, "realcount");
            return (Criteria) this;
        }

        public Criteria andRealcountLessThanOrEqualTo(Integer value) {
            addCriterion("realCount <=", value, "realcount");
            return (Criteria) this;
        }

        public Criteria andRealcountIn(List<Integer> values) {
            addCriterion("realCount in", values, "realcount");
            return (Criteria) this;
        }

        public Criteria andRealcountNotIn(List<Integer> values) {
            addCriterion("realCount not in", values, "realcount");
            return (Criteria) this;
        }

        public Criteria andRealcountBetween(Integer value1, Integer value2) {
            addCriterion("realCount between", value1, value2, "realcount");
            return (Criteria) this;
        }

        public Criteria andRealcountNotBetween(Integer value1, Integer value2) {
            addCriterion("realCount not between", value1, value2, "realcount");
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

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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