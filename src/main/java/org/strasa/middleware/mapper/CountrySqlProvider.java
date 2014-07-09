package org.strasa.middleware.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;

import org.strasa.middleware.model.Country;
import org.strasa.middleware.model.CountryExample;
import org.strasa.middleware.model.CountryExample.Criteria;
import org.strasa.middleware.model.CountryExample.Criterion;

public class CountrySqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table country
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String countByExample(CountryExample example) {
		BEGIN();
		SELECT("count(*)");
		FROM("country");
		applyWhere(example, false);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table country
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String deleteByExample(CountryExample example) {
		BEGIN();
		DELETE_FROM("country");
		applyWhere(example, false);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table country
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String insertSelective(Country record) {
		BEGIN();
		INSERT_INTO("country");
		if (record.getCntryid() != null) {
			VALUES("cntryid", "#{cntryid,jdbcType=INTEGER}");
		}
		if (record.getIsonum() != null) {
			VALUES("isonum", "#{isonum,jdbcType=INTEGER}");
		}
		if (record.getIsotwo() != null) {
			VALUES("isotwo", "#{isotwo,jdbcType=VARCHAR}");
		}
		if (record.getIsothree() != null) {
			VALUES("isothree", "#{isothree,jdbcType=VARCHAR}");
		}
		if (record.getFaothree() != null) {
			VALUES("faothree", "#{faothree,jdbcType=VARCHAR}");
		}
		if (record.getFips() != null) {
			VALUES("fips", "#{fips,jdbcType=VARCHAR}");
		}
		if (record.getWb() != null) {
			VALUES("wb", "#{wb,jdbcType=VARCHAR}");
		}
		if (record.getIsofull() != null) {
			VALUES("isofull", "#{isofull,jdbcType=VARCHAR}");
		}
		if (record.getIsoabbr() != null) {
			VALUES("isoabbr", "#{isoabbr,jdbcType=VARCHAR}");
		}
		if (record.getCont() != null) {
			VALUES("cont", "#{cont,jdbcType=VARCHAR}");
		}
		if (record.getScntry() != null) {
			VALUES("scntry", "#{scntry,jdbcType=INTEGER}");
		}
		if (record.getEcntry() != null) {
			VALUES("ecntry", "#{ecntry,jdbcType=INTEGER}");
		}
		if (record.getCchange() != null) {
			VALUES("cchange", "#{cchange,jdbcType=INTEGER}");
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table country
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String selectByExample(CountryExample example) {
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT("cntryid");
		} else {
			SELECT("cntryid");
		}
		SELECT("isonum");
		SELECT("isotwo");
		SELECT("isothree");
		SELECT("faothree");
		SELECT("fips");
		SELECT("wb");
		SELECT("isofull");
		SELECT("isoabbr");
		SELECT("cont");
		SELECT("scntry");
		SELECT("ecntry");
		SELECT("cchange");
		FROM("country");
		applyWhere(example, false);
		if (example != null && example.getOrderByClause() != null) {
			ORDER_BY(example.getOrderByClause());
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table country
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		Country record = (Country) parameter.get("record");
		CountryExample example = (CountryExample) parameter.get("example");
		BEGIN();
		UPDATE("country");
		if (record.getCntryid() != null) {
			SET("cntryid = #{record.cntryid,jdbcType=INTEGER}");
		}
		if (record.getIsonum() != null) {
			SET("isonum = #{record.isonum,jdbcType=INTEGER}");
		}
		if (record.getIsotwo() != null) {
			SET("isotwo = #{record.isotwo,jdbcType=VARCHAR}");
		}
		if (record.getIsothree() != null) {
			SET("isothree = #{record.isothree,jdbcType=VARCHAR}");
		}
		if (record.getFaothree() != null) {
			SET("faothree = #{record.faothree,jdbcType=VARCHAR}");
		}
		if (record.getFips() != null) {
			SET("fips = #{record.fips,jdbcType=VARCHAR}");
		}
		if (record.getWb() != null) {
			SET("wb = #{record.wb,jdbcType=VARCHAR}");
		}
		if (record.getIsofull() != null) {
			SET("isofull = #{record.isofull,jdbcType=VARCHAR}");
		}
		if (record.getIsoabbr() != null) {
			SET("isoabbr = #{record.isoabbr,jdbcType=VARCHAR}");
		}
		if (record.getCont() != null) {
			SET("cont = #{record.cont,jdbcType=VARCHAR}");
		}
		if (record.getScntry() != null) {
			SET("scntry = #{record.scntry,jdbcType=INTEGER}");
		}
		if (record.getEcntry() != null) {
			SET("ecntry = #{record.ecntry,jdbcType=INTEGER}");
		}
		if (record.getCchange() != null) {
			SET("cchange = #{record.cchange,jdbcType=INTEGER}");
		}
		applyWhere(example, true);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table country
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String updateByExample(Map<String, Object> parameter) {
		BEGIN();
		UPDATE("country");
		SET("cntryid = #{record.cntryid,jdbcType=INTEGER}");
		SET("isonum = #{record.isonum,jdbcType=INTEGER}");
		SET("isotwo = #{record.isotwo,jdbcType=VARCHAR}");
		SET("isothree = #{record.isothree,jdbcType=VARCHAR}");
		SET("faothree = #{record.faothree,jdbcType=VARCHAR}");
		SET("fips = #{record.fips,jdbcType=VARCHAR}");
		SET("wb = #{record.wb,jdbcType=VARCHAR}");
		SET("isofull = #{record.isofull,jdbcType=VARCHAR}");
		SET("isoabbr = #{record.isoabbr,jdbcType=VARCHAR}");
		SET("cont = #{record.cont,jdbcType=VARCHAR}");
		SET("scntry = #{record.scntry,jdbcType=INTEGER}");
		SET("ecntry = #{record.ecntry,jdbcType=INTEGER}");
		SET("cchange = #{record.cchange,jdbcType=INTEGER}");
		CountryExample example = (CountryExample) parameter.get("example");
		applyWhere(example, true);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table country
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String updateByPrimaryKeySelective(Country record) {
		BEGIN();
		UPDATE("country");
		if (record.getIsonum() != null) {
			SET("isonum = #{isonum,jdbcType=INTEGER}");
		}
		if (record.getIsotwo() != null) {
			SET("isotwo = #{isotwo,jdbcType=VARCHAR}");
		}
		if (record.getIsothree() != null) {
			SET("isothree = #{isothree,jdbcType=VARCHAR}");
		}
		if (record.getFaothree() != null) {
			SET("faothree = #{faothree,jdbcType=VARCHAR}");
		}
		if (record.getFips() != null) {
			SET("fips = #{fips,jdbcType=VARCHAR}");
		}
		if (record.getWb() != null) {
			SET("wb = #{wb,jdbcType=VARCHAR}");
		}
		if (record.getIsofull() != null) {
			SET("isofull = #{isofull,jdbcType=VARCHAR}");
		}
		if (record.getIsoabbr() != null) {
			SET("isoabbr = #{isoabbr,jdbcType=VARCHAR}");
		}
		if (record.getCont() != null) {
			SET("cont = #{cont,jdbcType=VARCHAR}");
		}
		if (record.getScntry() != null) {
			SET("scntry = #{scntry,jdbcType=INTEGER}");
		}
		if (record.getEcntry() != null) {
			SET("ecntry = #{ecntry,jdbcType=INTEGER}");
		}
		if (record.getCchange() != null) {
			SET("cchange = #{cchange,jdbcType=INTEGER}");
		}
		WHERE("cntryid = #{cntryid,jdbcType=INTEGER}");
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table country
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	protected void applyWhere(CountryExample example,
			boolean includeExamplePhrase) {
		if (example == null) {
			return;
		}
		String parmPhrase1;
		String parmPhrase1_th;
		String parmPhrase2;
		String parmPhrase2_th;
		String parmPhrase3;
		String parmPhrase3_th;
		if (includeExamplePhrase) {
			parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		} else {
			parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		}
		StringBuilder sb = new StringBuilder();
		List<Criteria> oredCriteria = example.getOredCriteria();
		boolean firstCriteria = true;
		for (int i = 0; i < oredCriteria.size(); i++) {
			Criteria criteria = oredCriteria.get(i);
			if (criteria.isValid()) {
				if (firstCriteria) {
					firstCriteria = false;
				} else {
					sb.append(" or ");
				}
				sb.append('(');
				List<Criterion> criterions = criteria.getAllCriteria();
				boolean firstCriterion = true;
				for (int j = 0; j < criterions.size(); j++) {
					Criterion criterion = criterions.get(j);
					if (firstCriterion) {
						firstCriterion = false;
					} else {
						sb.append(" and ");
					}
					if (criterion.isNoValue()) {
						sb.append(criterion.getCondition());
					} else if (criterion.isSingleValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase1,
									criterion.getCondition(), i, j));
						} else {
							sb.append(String.format(parmPhrase1_th,
									criterion.getCondition(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isBetweenValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase2,
									criterion.getCondition(), i, j, i, j));
						} else {
							sb.append(String.format(parmPhrase2_th,
									criterion.getCondition(), i, j,
									criterion.getTypeHandler(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isListValue()) {
						sb.append(criterion.getCondition());
						sb.append(" (");
						List<?> listItems = (List<?>) criterion.getValue();
						boolean comma = false;
						for (int k = 0; k < listItems.size(); k++) {
							if (comma) {
								sb.append(", ");
							} else {
								comma = true;
							}
							if (criterion.getTypeHandler() == null) {
								sb.append(String.format(parmPhrase3, i, j, k));
							} else {
								sb.append(String.format(parmPhrase3_th, i, j,
										k, criterion.getTypeHandler()));
							}
						}
						sb.append(')');
					}
				}
				sb.append(')');
			}
		}
		if (sb.length() > 0) {
			WHERE(sb.toString());
		}
	}
}