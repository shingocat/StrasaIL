package org.strasa.middleware.model;

import java.util.ArrayList;
import java.util.List;

public class GeorefExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public GeorefExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andLocidIsNull() {
			addCriterion("locid is null");
			return (Criteria) this;
		}

		public Criteria andLocidIsNotNull() {
			addCriterion("locid is not null");
			return (Criteria) this;
		}

		public Criteria andLocidEqualTo(Integer value) {
			addCriterion("locid =", value, "locid");
			return (Criteria) this;
		}

		public Criteria andLocidNotEqualTo(Integer value) {
			addCriterion("locid <>", value, "locid");
			return (Criteria) this;
		}

		public Criteria andLocidGreaterThan(Integer value) {
			addCriterion("locid >", value, "locid");
			return (Criteria) this;
		}

		public Criteria andLocidGreaterThanOrEqualTo(Integer value) {
			addCriterion("locid >=", value, "locid");
			return (Criteria) this;
		}

		public Criteria andLocidLessThan(Integer value) {
			addCriterion("locid <", value, "locid");
			return (Criteria) this;
		}

		public Criteria andLocidLessThanOrEqualTo(Integer value) {
			addCriterion("locid <=", value, "locid");
			return (Criteria) this;
		}

		public Criteria andLocidIn(List<Integer> values) {
			addCriterion("locid in", values, "locid");
			return (Criteria) this;
		}

		public Criteria andLocidNotIn(List<Integer> values) {
			addCriterion("locid not in", values, "locid");
			return (Criteria) this;
		}

		public Criteria andLocidBetween(Integer value1, Integer value2) {
			addCriterion("locid between", value1, value2, "locid");
			return (Criteria) this;
		}

		public Criteria andLocidNotBetween(Integer value1, Integer value2) {
			addCriterion("locid not between", value1, value2, "locid");
			return (Criteria) this;
		}

		public Criteria andLlpnIsNull() {
			addCriterion("llpn is null");
			return (Criteria) this;
		}

		public Criteria andLlpnIsNotNull() {
			addCriterion("llpn is not null");
			return (Criteria) this;
		}

		public Criteria andLlpnEqualTo(Integer value) {
			addCriterion("llpn =", value, "llpn");
			return (Criteria) this;
		}

		public Criteria andLlpnNotEqualTo(Integer value) {
			addCriterion("llpn <>", value, "llpn");
			return (Criteria) this;
		}

		public Criteria andLlpnGreaterThan(Integer value) {
			addCriterion("llpn >", value, "llpn");
			return (Criteria) this;
		}

		public Criteria andLlpnGreaterThanOrEqualTo(Integer value) {
			addCriterion("llpn >=", value, "llpn");
			return (Criteria) this;
		}

		public Criteria andLlpnLessThan(Integer value) {
			addCriterion("llpn <", value, "llpn");
			return (Criteria) this;
		}

		public Criteria andLlpnLessThanOrEqualTo(Integer value) {
			addCriterion("llpn <=", value, "llpn");
			return (Criteria) this;
		}

		public Criteria andLlpnIn(List<Integer> values) {
			addCriterion("llpn in", values, "llpn");
			return (Criteria) this;
		}

		public Criteria andLlpnNotIn(List<Integer> values) {
			addCriterion("llpn not in", values, "llpn");
			return (Criteria) this;
		}

		public Criteria andLlpnBetween(Integer value1, Integer value2) {
			addCriterion("llpn between", value1, value2, "llpn");
			return (Criteria) this;
		}

		public Criteria andLlpnNotBetween(Integer value1, Integer value2) {
			addCriterion("llpn not between", value1, value2, "llpn");
			return (Criteria) this;
		}

		public Criteria andLatIsNull() {
			addCriterion("lat is null");
			return (Criteria) this;
		}

		public Criteria andLatIsNotNull() {
			addCriterion("lat is not null");
			return (Criteria) this;
		}

		public Criteria andLatEqualTo(Double value) {
			addCriterion("lat =", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatNotEqualTo(Double value) {
			addCriterion("lat <>", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatGreaterThan(Double value) {
			addCriterion("lat >", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatGreaterThanOrEqualTo(Double value) {
			addCriterion("lat >=", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatLessThan(Double value) {
			addCriterion("lat <", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatLessThanOrEqualTo(Double value) {
			addCriterion("lat <=", value, "lat");
			return (Criteria) this;
		}

		public Criteria andLatIn(List<Double> values) {
			addCriterion("lat in", values, "lat");
			return (Criteria) this;
		}

		public Criteria andLatNotIn(List<Double> values) {
			addCriterion("lat not in", values, "lat");
			return (Criteria) this;
		}

		public Criteria andLatBetween(Double value1, Double value2) {
			addCriterion("lat between", value1, value2, "lat");
			return (Criteria) this;
		}

		public Criteria andLatNotBetween(Double value1, Double value2) {
			addCriterion("lat not between", value1, value2, "lat");
			return (Criteria) this;
		}

		public Criteria andLonIsNull() {
			addCriterion("lon is null");
			return (Criteria) this;
		}

		public Criteria andLonIsNotNull() {
			addCriterion("lon is not null");
			return (Criteria) this;
		}

		public Criteria andLonEqualTo(Double value) {
			addCriterion("lon =", value, "lon");
			return (Criteria) this;
		}

		public Criteria andLonNotEqualTo(Double value) {
			addCriterion("lon <>", value, "lon");
			return (Criteria) this;
		}

		public Criteria andLonGreaterThan(Double value) {
			addCriterion("lon >", value, "lon");
			return (Criteria) this;
		}

		public Criteria andLonGreaterThanOrEqualTo(Double value) {
			addCriterion("lon >=", value, "lon");
			return (Criteria) this;
		}

		public Criteria andLonLessThan(Double value) {
			addCriterion("lon <", value, "lon");
			return (Criteria) this;
		}

		public Criteria andLonLessThanOrEqualTo(Double value) {
			addCriterion("lon <=", value, "lon");
			return (Criteria) this;
		}

		public Criteria andLonIn(List<Double> values) {
			addCriterion("lon in", values, "lon");
			return (Criteria) this;
		}

		public Criteria andLonNotIn(List<Double> values) {
			addCriterion("lon not in", values, "lon");
			return (Criteria) this;
		}

		public Criteria andLonBetween(Double value1, Double value2) {
			addCriterion("lon between", value1, value2, "lon");
			return (Criteria) this;
		}

		public Criteria andLonNotBetween(Double value1, Double value2) {
			addCriterion("lon not between", value1, value2, "lon");
			return (Criteria) this;
		}

		public Criteria andAltIsNull() {
			addCriterion("alt is null");
			return (Criteria) this;
		}

		public Criteria andAltIsNotNull() {
			addCriterion("alt is not null");
			return (Criteria) this;
		}

		public Criteria andAltEqualTo(Double value) {
			addCriterion("alt =", value, "alt");
			return (Criteria) this;
		}

		public Criteria andAltNotEqualTo(Double value) {
			addCriterion("alt <>", value, "alt");
			return (Criteria) this;
		}

		public Criteria andAltGreaterThan(Double value) {
			addCriterion("alt >", value, "alt");
			return (Criteria) this;
		}

		public Criteria andAltGreaterThanOrEqualTo(Double value) {
			addCriterion("alt >=", value, "alt");
			return (Criteria) this;
		}

		public Criteria andAltLessThan(Double value) {
			addCriterion("alt <", value, "alt");
			return (Criteria) this;
		}

		public Criteria andAltLessThanOrEqualTo(Double value) {
			addCriterion("alt <=", value, "alt");
			return (Criteria) this;
		}

		public Criteria andAltIn(List<Double> values) {
			addCriterion("alt in", values, "alt");
			return (Criteria) this;
		}

		public Criteria andAltNotIn(List<Double> values) {
			addCriterion("alt not in", values, "alt");
			return (Criteria) this;
		}

		public Criteria andAltBetween(Double value1, Double value2) {
			addCriterion("alt between", value1, value2, "alt");
			return (Criteria) this;
		}

		public Criteria andAltNotBetween(Double value1, Double value2) {
			addCriterion("alt not between", value1, value2, "alt");
			return (Criteria) this;
		}

		public Criteria andLlsourceIsNull() {
			addCriterion("llsource is null");
			return (Criteria) this;
		}

		public Criteria andLlsourceIsNotNull() {
			addCriterion("llsource is not null");
			return (Criteria) this;
		}

		public Criteria andLlsourceEqualTo(Integer value) {
			addCriterion("llsource =", value, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlsourceNotEqualTo(Integer value) {
			addCriterion("llsource <>", value, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlsourceGreaterThan(Integer value) {
			addCriterion("llsource >", value, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlsourceGreaterThanOrEqualTo(Integer value) {
			addCriterion("llsource >=", value, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlsourceLessThan(Integer value) {
			addCriterion("llsource <", value, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlsourceLessThanOrEqualTo(Integer value) {
			addCriterion("llsource <=", value, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlsourceIn(List<Integer> values) {
			addCriterion("llsource in", values, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlsourceNotIn(List<Integer> values) {
			addCriterion("llsource not in", values, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlsourceBetween(Integer value1, Integer value2) {
			addCriterion("llsource between", value1, value2, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlsourceNotBetween(Integer value1, Integer value2) {
			addCriterion("llsource not between", value1, value2, "llsource");
			return (Criteria) this;
		}

		public Criteria andLlFmtIsNull() {
			addCriterion("ll_fmt is null");
			return (Criteria) this;
		}

		public Criteria andLlFmtIsNotNull() {
			addCriterion("ll_fmt is not null");
			return (Criteria) this;
		}

		public Criteria andLlFmtEqualTo(Integer value) {
			addCriterion("ll_fmt =", value, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlFmtNotEqualTo(Integer value) {
			addCriterion("ll_fmt <>", value, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlFmtGreaterThan(Integer value) {
			addCriterion("ll_fmt >", value, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlFmtGreaterThanOrEqualTo(Integer value) {
			addCriterion("ll_fmt >=", value, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlFmtLessThan(Integer value) {
			addCriterion("ll_fmt <", value, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlFmtLessThanOrEqualTo(Integer value) {
			addCriterion("ll_fmt <=", value, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlFmtIn(List<Integer> values) {
			addCriterion("ll_fmt in", values, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlFmtNotIn(List<Integer> values) {
			addCriterion("ll_fmt not in", values, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlFmtBetween(Integer value1, Integer value2) {
			addCriterion("ll_fmt between", value1, value2, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlFmtNotBetween(Integer value1, Integer value2) {
			addCriterion("ll_fmt not between", value1, value2, "llFmt");
			return (Criteria) this;
		}

		public Criteria andLlDatumIsNull() {
			addCriterion("ll_datum is null");
			return (Criteria) this;
		}

		public Criteria andLlDatumIsNotNull() {
			addCriterion("ll_datum is not null");
			return (Criteria) this;
		}

		public Criteria andLlDatumEqualTo(Integer value) {
			addCriterion("ll_datum =", value, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlDatumNotEqualTo(Integer value) {
			addCriterion("ll_datum <>", value, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlDatumGreaterThan(Integer value) {
			addCriterion("ll_datum >", value, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlDatumGreaterThanOrEqualTo(Integer value) {
			addCriterion("ll_datum >=", value, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlDatumLessThan(Integer value) {
			addCriterion("ll_datum <", value, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlDatumLessThanOrEqualTo(Integer value) {
			addCriterion("ll_datum <=", value, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlDatumIn(List<Integer> values) {
			addCriterion("ll_datum in", values, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlDatumNotIn(List<Integer> values) {
			addCriterion("ll_datum not in", values, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlDatumBetween(Integer value1, Integer value2) {
			addCriterion("ll_datum between", value1, value2, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlDatumNotBetween(Integer value1, Integer value2) {
			addCriterion("ll_datum not between", value1, value2, "llDatum");
			return (Criteria) this;
		}

		public Criteria andLlUncertIsNull() {
			addCriterion("ll_uncert is null");
			return (Criteria) this;
		}

		public Criteria andLlUncertIsNotNull() {
			addCriterion("ll_uncert is not null");
			return (Criteria) this;
		}

		public Criteria andLlUncertEqualTo(Double value) {
			addCriterion("ll_uncert =", value, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlUncertNotEqualTo(Double value) {
			addCriterion("ll_uncert <>", value, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlUncertGreaterThan(Double value) {
			addCriterion("ll_uncert >", value, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlUncertGreaterThanOrEqualTo(Double value) {
			addCriterion("ll_uncert >=", value, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlUncertLessThan(Double value) {
			addCriterion("ll_uncert <", value, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlUncertLessThanOrEqualTo(Double value) {
			addCriterion("ll_uncert <=", value, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlUncertIn(List<Double> values) {
			addCriterion("ll_uncert in", values, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlUncertNotIn(List<Double> values) {
			addCriterion("ll_uncert not in", values, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlUncertBetween(Double value1, Double value2) {
			addCriterion("ll_uncert between", value1, value2, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlUncertNotBetween(Double value1, Double value2) {
			addCriterion("ll_uncert not between", value1, value2, "llUncert");
			return (Criteria) this;
		}

		public Criteria andLlrefIsNull() {
			addCriterion("llref is null");
			return (Criteria) this;
		}

		public Criteria andLlrefIsNotNull() {
			addCriterion("llref is not null");
			return (Criteria) this;
		}

		public Criteria andLlrefEqualTo(Integer value) {
			addCriterion("llref =", value, "llref");
			return (Criteria) this;
		}

		public Criteria andLlrefNotEqualTo(Integer value) {
			addCriterion("llref <>", value, "llref");
			return (Criteria) this;
		}

		public Criteria andLlrefGreaterThan(Integer value) {
			addCriterion("llref >", value, "llref");
			return (Criteria) this;
		}

		public Criteria andLlrefGreaterThanOrEqualTo(Integer value) {
			addCriterion("llref >=", value, "llref");
			return (Criteria) this;
		}

		public Criteria andLlrefLessThan(Integer value) {
			addCriterion("llref <", value, "llref");
			return (Criteria) this;
		}

		public Criteria andLlrefLessThanOrEqualTo(Integer value) {
			addCriterion("llref <=", value, "llref");
			return (Criteria) this;
		}

		public Criteria andLlrefIn(List<Integer> values) {
			addCriterion("llref in", values, "llref");
			return (Criteria) this;
		}

		public Criteria andLlrefNotIn(List<Integer> values) {
			addCriterion("llref not in", values, "llref");
			return (Criteria) this;
		}

		public Criteria andLlrefBetween(Integer value1, Integer value2) {
			addCriterion("llref between", value1, value2, "llref");
			return (Criteria) this;
		}

		public Criteria andLlrefNotBetween(Integer value1, Integer value2) {
			addCriterion("llref not between", value1, value2, "llref");
			return (Criteria) this;
		}

		public Criteria andLldateIsNull() {
			addCriterion("lldate is null");
			return (Criteria) this;
		}

		public Criteria andLldateIsNotNull() {
			addCriterion("lldate is not null");
			return (Criteria) this;
		}

		public Criteria andLldateEqualTo(Integer value) {
			addCriterion("lldate =", value, "lldate");
			return (Criteria) this;
		}

		public Criteria andLldateNotEqualTo(Integer value) {
			addCriterion("lldate <>", value, "lldate");
			return (Criteria) this;
		}

		public Criteria andLldateGreaterThan(Integer value) {
			addCriterion("lldate >", value, "lldate");
			return (Criteria) this;
		}

		public Criteria andLldateGreaterThanOrEqualTo(Integer value) {
			addCriterion("lldate >=", value, "lldate");
			return (Criteria) this;
		}

		public Criteria andLldateLessThan(Integer value) {
			addCriterion("lldate <", value, "lldate");
			return (Criteria) this;
		}

		public Criteria andLldateLessThanOrEqualTo(Integer value) {
			addCriterion("lldate <=", value, "lldate");
			return (Criteria) this;
		}

		public Criteria andLldateIn(List<Integer> values) {
			addCriterion("lldate in", values, "lldate");
			return (Criteria) this;
		}

		public Criteria andLldateNotIn(List<Integer> values) {
			addCriterion("lldate not in", values, "lldate");
			return (Criteria) this;
		}

		public Criteria andLldateBetween(Integer value1, Integer value2) {
			addCriterion("lldate between", value1, value2, "lldate");
			return (Criteria) this;
		}

		public Criteria andLldateNotBetween(Integer value1, Integer value2) {
			addCriterion("lldate not between", value1, value2, "lldate");
			return (Criteria) this;
		}

		public Criteria andLluidIsNull() {
			addCriterion("lluid is null");
			return (Criteria) this;
		}

		public Criteria andLluidIsNotNull() {
			addCriterion("lluid is not null");
			return (Criteria) this;
		}

		public Criteria andLluidEqualTo(Integer value) {
			addCriterion("lluid =", value, "lluid");
			return (Criteria) this;
		}

		public Criteria andLluidNotEqualTo(Integer value) {
			addCriterion("lluid <>", value, "lluid");
			return (Criteria) this;
		}

		public Criteria andLluidGreaterThan(Integer value) {
			addCriterion("lluid >", value, "lluid");
			return (Criteria) this;
		}

		public Criteria andLluidGreaterThanOrEqualTo(Integer value) {
			addCriterion("lluid >=", value, "lluid");
			return (Criteria) this;
		}

		public Criteria andLluidLessThan(Integer value) {
			addCriterion("lluid <", value, "lluid");
			return (Criteria) this;
		}

		public Criteria andLluidLessThanOrEqualTo(Integer value) {
			addCriterion("lluid <=", value, "lluid");
			return (Criteria) this;
		}

		public Criteria andLluidIn(List<Integer> values) {
			addCriterion("lluid in", values, "lluid");
			return (Criteria) this;
		}

		public Criteria andLluidNotIn(List<Integer> values) {
			addCriterion("lluid not in", values, "lluid");
			return (Criteria) this;
		}

		public Criteria andLluidBetween(Integer value1, Integer value2) {
			addCriterion("lluid between", value1, value2, "lluid");
			return (Criteria) this;
		}

		public Criteria andLluidNotBetween(Integer value1, Integer value2) {
			addCriterion("lluid not between", value1, value2, "lluid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table georef
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table georef
     *
     * @mbggenerated do_not_delete_during_merge Fri Oct 25 13:11:54 SGT 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}