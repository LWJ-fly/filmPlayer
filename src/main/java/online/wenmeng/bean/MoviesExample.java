package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoviesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoviesExample() {
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

        public Criteria andMovenameIsNull() {
            addCriterion("moveName is null");
            return (Criteria) this;
        }

        public Criteria andMovenameIsNotNull() {
            addCriterion("moveName is not null");
            return (Criteria) this;
        }

        public Criteria andMovenameEqualTo(String value) {
            addCriterion("moveName =", value, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameNotEqualTo(String value) {
            addCriterion("moveName <>", value, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameGreaterThan(String value) {
            addCriterion("moveName >", value, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameGreaterThanOrEqualTo(String value) {
            addCriterion("moveName >=", value, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameLessThan(String value) {
            addCriterion("moveName <", value, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameLessThanOrEqualTo(String value) {
            addCriterion("moveName <=", value, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameLike(String value) {
            addCriterion("moveName like", value, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameNotLike(String value) {
            addCriterion("moveName not like", value, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameIn(List<String> values) {
            addCriterion("moveName in", values, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameNotIn(List<String> values) {
            addCriterion("moveName not in", values, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameBetween(String value1, String value2) {
            addCriterion("moveName between", value1, value2, "movename");
            return (Criteria) this;
        }

        public Criteria andMovenameNotBetween(String value1, String value2) {
            addCriterion("moveName not between", value1, value2, "movename");
            return (Criteria) this;
        }

        public Criteria andMoveavatarIsNull() {
            addCriterion("moveAvatar is null");
            return (Criteria) this;
        }

        public Criteria andMoveavatarIsNotNull() {
            addCriterion("moveAvatar is not null");
            return (Criteria) this;
        }

        public Criteria andMoveavatarEqualTo(String value) {
            addCriterion("moveAvatar =", value, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarNotEqualTo(String value) {
            addCriterion("moveAvatar <>", value, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarGreaterThan(String value) {
            addCriterion("moveAvatar >", value, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarGreaterThanOrEqualTo(String value) {
            addCriterion("moveAvatar >=", value, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarLessThan(String value) {
            addCriterion("moveAvatar <", value, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarLessThanOrEqualTo(String value) {
            addCriterion("moveAvatar <=", value, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarLike(String value) {
            addCriterion("moveAvatar like", value, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarNotLike(String value) {
            addCriterion("moveAvatar not like", value, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarIn(List<String> values) {
            addCriterion("moveAvatar in", values, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarNotIn(List<String> values) {
            addCriterion("moveAvatar not in", values, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarBetween(String value1, String value2) {
            addCriterion("moveAvatar between", value1, value2, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andMoveavatarNotBetween(String value1, String value2) {
            addCriterion("moveAvatar not between", value1, value2, "moveavatar");
            return (Criteria) this;
        }

        public Criteria andStartdataIsNull() {
            addCriterion("startData is null");
            return (Criteria) this;
        }

        public Criteria andStartdataIsNotNull() {
            addCriterion("startData is not null");
            return (Criteria) this;
        }

        public Criteria andStartdataEqualTo(String value) {
            addCriterion("startData =", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotEqualTo(String value) {
            addCriterion("startData <>", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataGreaterThan(String value) {
            addCriterion("startData >", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataGreaterThanOrEqualTo(String value) {
            addCriterion("startData >=", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataLessThan(String value) {
            addCriterion("startData <", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataLessThanOrEqualTo(String value) {
            addCriterion("startData <=", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataLike(String value) {
            addCriterion("startData like", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotLike(String value) {
            addCriterion("startData not like", value, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataIn(List<String> values) {
            addCriterion("startData in", values, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotIn(List<String> values) {
            addCriterion("startData not in", values, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataBetween(String value1, String value2) {
            addCriterion("startData between", value1, value2, "startdata");
            return (Criteria) this;
        }

        public Criteria andStartdataNotBetween(String value1, String value2) {
            addCriterion("startData not between", value1, value2, "startdata");
            return (Criteria) this;
        }

        public Criteria andFilmtimeIsNull() {
            addCriterion("filmTime is null");
            return (Criteria) this;
        }

        public Criteria andFilmtimeIsNotNull() {
            addCriterion("filmTime is not null");
            return (Criteria) this;
        }

        public Criteria andFilmtimeEqualTo(Date value) {
            addCriterion("filmTime =", value, "filmtime");
            return (Criteria) this;
        }

        public Criteria andFilmtimeNotEqualTo(Date value) {
            addCriterion("filmTime <>", value, "filmtime");
            return (Criteria) this;
        }

        public Criteria andFilmtimeGreaterThan(Date value) {
            addCriterion("filmTime >", value, "filmtime");
            return (Criteria) this;
        }

        public Criteria andFilmtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("filmTime >=", value, "filmtime");
            return (Criteria) this;
        }

        public Criteria andFilmtimeLessThan(Date value) {
            addCriterion("filmTime <", value, "filmtime");
            return (Criteria) this;
        }

        public Criteria andFilmtimeLessThanOrEqualTo(Date value) {
            addCriterion("filmTime <=", value, "filmtime");
            return (Criteria) this;
        }

        public Criteria andFilmtimeIn(List<Date> values) {
            addCriterion("filmTime in", values, "filmtime");
            return (Criteria) this;
        }

        public Criteria andFilmtimeNotIn(List<Date> values) {
            addCriterion("filmTime not in", values, "filmtime");
            return (Criteria) this;
        }

        public Criteria andFilmtimeBetween(Date value1, Date value2) {
            addCriterion("filmTime between", value1, value2, "filmtime");
            return (Criteria) this;
        }

        public Criteria andFilmtimeNotBetween(Date value1, Date value2) {
            addCriterion("filmTime not between", value1, value2, "filmtime");
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

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andActorsIsNull() {
            addCriterion("actors is null");
            return (Criteria) this;
        }

        public Criteria andActorsIsNotNull() {
            addCriterion("actors is not null");
            return (Criteria) this;
        }

        public Criteria andActorsEqualTo(String value) {
            addCriterion("actors =", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotEqualTo(String value) {
            addCriterion("actors <>", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsGreaterThan(String value) {
            addCriterion("actors >", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsGreaterThanOrEqualTo(String value) {
            addCriterion("actors >=", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsLessThan(String value) {
            addCriterion("actors <", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsLessThanOrEqualTo(String value) {
            addCriterion("actors <=", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsLike(String value) {
            addCriterion("actors like", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotLike(String value) {
            addCriterion("actors not like", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsIn(List<String> values) {
            addCriterion("actors in", values, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotIn(List<String> values) {
            addCriterion("actors not in", values, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsBetween(String value1, String value2) {
            addCriterion("actors between", value1, value2, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotBetween(String value1, String value2) {
            addCriterion("actors not between", value1, value2, "actors");
            return (Criteria) this;
        }

        public Criteria andFilmtypeIsNull() {
            addCriterion("filmType is null");
            return (Criteria) this;
        }

        public Criteria andFilmtypeIsNotNull() {
            addCriterion("filmType is not null");
            return (Criteria) this;
        }

        public Criteria andFilmtypeEqualTo(String value) {
            addCriterion("filmType =", value, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeNotEqualTo(String value) {
            addCriterion("filmType <>", value, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeGreaterThan(String value) {
            addCriterion("filmType >", value, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeGreaterThanOrEqualTo(String value) {
            addCriterion("filmType >=", value, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeLessThan(String value) {
            addCriterion("filmType <", value, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeLessThanOrEqualTo(String value) {
            addCriterion("filmType <=", value, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeLike(String value) {
            addCriterion("filmType like", value, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeNotLike(String value) {
            addCriterion("filmType not like", value, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeIn(List<String> values) {
            addCriterion("filmType in", values, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeNotIn(List<String> values) {
            addCriterion("filmType not in", values, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeBetween(String value1, String value2) {
            addCriterion("filmType between", value1, value2, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmtypeNotBetween(String value1, String value2) {
            addCriterion("filmType not between", value1, value2, "filmtype");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeIsNull() {
            addCriterion("filmDescribe is null");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeIsNotNull() {
            addCriterion("filmDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeEqualTo(String value) {
            addCriterion("filmDescribe =", value, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeNotEqualTo(String value) {
            addCriterion("filmDescribe <>", value, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeGreaterThan(String value) {
            addCriterion("filmDescribe >", value, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("filmDescribe >=", value, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeLessThan(String value) {
            addCriterion("filmDescribe <", value, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeLessThanOrEqualTo(String value) {
            addCriterion("filmDescribe <=", value, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeLike(String value) {
            addCriterion("filmDescribe like", value, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeNotLike(String value) {
            addCriterion("filmDescribe not like", value, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeIn(List<String> values) {
            addCriterion("filmDescribe in", values, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeNotIn(List<String> values) {
            addCriterion("filmDescribe not in", values, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeBetween(String value1, String value2) {
            addCriterion("filmDescribe between", value1, value2, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmdescribeNotBetween(String value1, String value2) {
            addCriterion("filmDescribe not between", value1, value2, "filmdescribe");
            return (Criteria) this;
        }

        public Criteria andFilmplaceIsNull() {
            addCriterion("filmPlace is null");
            return (Criteria) this;
        }

        public Criteria andFilmplaceIsNotNull() {
            addCriterion("filmPlace is not null");
            return (Criteria) this;
        }

        public Criteria andFilmplaceEqualTo(String value) {
            addCriterion("filmPlace =", value, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceNotEqualTo(String value) {
            addCriterion("filmPlace <>", value, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceGreaterThan(String value) {
            addCriterion("filmPlace >", value, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceGreaterThanOrEqualTo(String value) {
            addCriterion("filmPlace >=", value, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceLessThan(String value) {
            addCriterion("filmPlace <", value, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceLessThanOrEqualTo(String value) {
            addCriterion("filmPlace <=", value, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceLike(String value) {
            addCriterion("filmPlace like", value, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceNotLike(String value) {
            addCriterion("filmPlace not like", value, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceIn(List<String> values) {
            addCriterion("filmPlace in", values, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceNotIn(List<String> values) {
            addCriterion("filmPlace not in", values, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceBetween(String value1, String value2) {
            addCriterion("filmPlace between", value1, value2, "filmplace");
            return (Criteria) this;
        }

        public Criteria andFilmplaceNotBetween(String value1, String value2) {
            addCriterion("filmPlace not between", value1, value2, "filmplace");
            return (Criteria) this;
        }

        public Criteria andCommentcountsIsNull() {
            addCriterion("commentCounts is null");
            return (Criteria) this;
        }

        public Criteria andCommentcountsIsNotNull() {
            addCriterion("commentCounts is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcountsEqualTo(Integer value) {
            addCriterion("commentCounts =", value, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andCommentcountsNotEqualTo(Integer value) {
            addCriterion("commentCounts <>", value, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andCommentcountsGreaterThan(Integer value) {
            addCriterion("commentCounts >", value, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andCommentcountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentCounts >=", value, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andCommentcountsLessThan(Integer value) {
            addCriterion("commentCounts <", value, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andCommentcountsLessThanOrEqualTo(Integer value) {
            addCriterion("commentCounts <=", value, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andCommentcountsIn(List<Integer> values) {
            addCriterion("commentCounts in", values, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andCommentcountsNotIn(List<Integer> values) {
            addCriterion("commentCounts not in", values, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andCommentcountsBetween(Integer value1, Integer value2) {
            addCriterion("commentCounts between", value1, value2, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andCommentcountsNotBetween(Integer value1, Integer value2) {
            addCriterion("commentCounts not between", value1, value2, "commentcounts");
            return (Criteria) this;
        }

        public Criteria andScorenumIsNull() {
            addCriterion("scoreNum is null");
            return (Criteria) this;
        }

        public Criteria andScorenumIsNotNull() {
            addCriterion("scoreNum is not null");
            return (Criteria) this;
        }

        public Criteria andScorenumEqualTo(Integer value) {
            addCriterion("scoreNum =", value, "scorenum");
            return (Criteria) this;
        }

        public Criteria andScorenumNotEqualTo(Integer value) {
            addCriterion("scoreNum <>", value, "scorenum");
            return (Criteria) this;
        }

        public Criteria andScorenumGreaterThan(Integer value) {
            addCriterion("scoreNum >", value, "scorenum");
            return (Criteria) this;
        }

        public Criteria andScorenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("scoreNum >=", value, "scorenum");
            return (Criteria) this;
        }

        public Criteria andScorenumLessThan(Integer value) {
            addCriterion("scoreNum <", value, "scorenum");
            return (Criteria) this;
        }

        public Criteria andScorenumLessThanOrEqualTo(Integer value) {
            addCriterion("scoreNum <=", value, "scorenum");
            return (Criteria) this;
        }

        public Criteria andScorenumIn(List<Integer> values) {
            addCriterion("scoreNum in", values, "scorenum");
            return (Criteria) this;
        }

        public Criteria andScorenumNotIn(List<Integer> values) {
            addCriterion("scoreNum not in", values, "scorenum");
            return (Criteria) this;
        }

        public Criteria andScorenumBetween(Integer value1, Integer value2) {
            addCriterion("scoreNum between", value1, value2, "scorenum");
            return (Criteria) this;
        }

        public Criteria andScorenumNotBetween(Integer value1, Integer value2) {
            addCriterion("scoreNum not between", value1, value2, "scorenum");
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