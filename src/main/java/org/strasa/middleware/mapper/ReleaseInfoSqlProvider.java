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
import org.strasa.middleware.model.ReleaseInfo;
import org.strasa.middleware.model.ReleaseInfoExample.Criteria;
import org.strasa.middleware.model.ReleaseInfoExample.Criterion;
import org.strasa.middleware.model.ReleaseInfoExample;

public class ReleaseInfoSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	public String countByExample(ReleaseInfoExample example) {
		BEGIN();
		SELECT("count(*)");
		FROM("releaseinfo");
		applyWhere(example, false);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	public String deleteByExample(ReleaseInfoExample example) {
		BEGIN();
		DELETE_FROM("releaseinfo");
		applyWhere(example, false);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	public String insertSelective(ReleaseInfo record) {
		BEGIN();
		INSERT_INTO("releaseinfo");
		if (record.getProgramid() != null) {
			VALUES("programid", "#{programid,jdbcType=INTEGER}");
		}
		if (record.getProjectid() != null) {
			VALUES("projectid", "#{projectid,jdbcType=INTEGER}");
		}
		if (record.getGermplasmname() != null) {
			VALUES("germplasmname", "#{germplasmname,jdbcType=VARCHAR}");
		}
		if (record.getDatasource() != null) {
			VALUES("datasource", "#{datasource,jdbcType=VARCHAR}");
		}
		if (record.getYearrelease() != null) {
			VALUES("yearrelease", "#{yearrelease,jdbcType=VARCHAR}");
		}
		if (record.getCountryrelease() != null) {
			VALUES("countryrelease", "#{countryrelease,jdbcType=VARCHAR}");
		}
		if (record.getSeedavailability() != null) {
			VALUES("seedavailability", "#{seedavailability,jdbcType=INTEGER}");
		}
		if (record.getUserid() != null) {
			VALUES("userid", "#{userid,jdbcType=INTEGER}");
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	public String selectByExample(ReleaseInfoExample example) {
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT("id");
		} else {
			SELECT("id");
		}
		SELECT("programid");
		SELECT("projectid");
		SELECT("germplasmname");
		SELECT("datasource");
		SELECT("yearrelease");
		SELECT("countryrelease");
		SELECT("seedavailability");
		SELECT("userid");
		FROM("releaseinfo");
		applyWhere(example, false);
		if (example != null && example.getOrderByClause() != null) {
			ORDER_BY(example.getOrderByClause());
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		ReleaseInfo record = (ReleaseInfo) parameter.get("record");
		ReleaseInfoExample example = (ReleaseInfoExample) parameter
				.get("example");
		BEGIN();
		UPDATE("releaseinfo");
		if (record.getId() != null) {
			SET("id = #{record.id,jdbcType=INTEGER}");
		}
		if (record.getProgramid() != null) {
			SET("programid = #{record.programid,jdbcType=INTEGER}");
		}
		if (record.getProjectid() != null) {
			SET("projectid = #{record.projectid,jdbcType=INTEGER}");
		}
		if (record.getGermplasmname() != null) {
			SET("germplasmname = #{record.germplasmname,jdbcType=VARCHAR}");
		}
		if (record.getDatasource() != null) {
			SET("datasource = #{record.datasource,jdbcType=VARCHAR}");
		}
		if (record.getYearrelease() != null) {
			SET("yearrelease = #{record.yearrelease,jdbcType=VARCHAR}");
		}
		if (record.getCountryrelease() != null) {
			SET("countryrelease = #{record.countryrelease,jdbcType=VARCHAR}");
		}
		if (record.getSeedavailability() != null) {
			SET("seedavailability = #{record.seedavailability,jdbcType=INTEGER}");
		}
		if (record.getUserid() != null) {
			SET("userid = #{record.userid,jdbcType=INTEGER}");
		}
		applyWhere(example, true);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	public String updateByExample(Map<String, Object> parameter) {
		BEGIN();
		UPDATE("releaseinfo");
		SET("id = #{record.id,jdbcType=INTEGER}");
		SET("programid = #{record.programid,jdbcType=INTEGER}");
		SET("projectid = #{record.projectid,jdbcType=INTEGER}");
		SET("germplasmname = #{record.germplasmname,jdbcType=VARCHAR}");
		SET("datasource = #{record.datasource,jdbcType=VARCHAR}");
		SET("yearrelease = #{record.yearrelease,jdbcType=VARCHAR}");
		SET("countryrelease = #{record.countryrelease,jdbcType=VARCHAR}");
		SET("seedavailability = #{record.seedavailability,jdbcType=INTEGER}");
		SET("userid = #{record.userid,jdbcType=INTEGER}");
		ReleaseInfoExample example = (ReleaseInfoExample) parameter
				.get("example");
		applyWhere(example, true);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	public String updateByPrimaryKeySelective(ReleaseInfo record) {
		BEGIN();
		UPDATE("releaseinfo");
		if (record.getProgramid() != null) {
			SET("programid = #{programid,jdbcType=INTEGER}");
		}
		if (record.getProjectid() != null) {
			SET("projectid = #{projectid,jdbcType=INTEGER}");
		}
		if (record.getGermplasmname() != null) {
			SET("germplasmname = #{germplasmname,jdbcType=VARCHAR}");
		}
		if (record.getDatasource() != null) {
			SET("datasource = #{datasource,jdbcType=VARCHAR}");
		}
		if (record.getYearrelease() != null) {
			SET("yearrelease = #{yearrelease,jdbcType=VARCHAR}");
		}
		if (record.getCountryrelease() != null) {
			SET("countryrelease = #{countryrelease,jdbcType=VARCHAR}");
		}
		if (record.getSeedavailability() != null) {
			SET("seedavailability = #{seedavailability,jdbcType=INTEGER}");
		}
		if (record.getUserid() != null) {
			SET("userid = #{userid,jdbcType=INTEGER}");
		}
		WHERE("id = #{id,jdbcType=INTEGER}");
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table releaseinfo
	 * @mbggenerated  Wed Mar 12 09:07:47 SGT 2014
	 */
	protected void applyWhere(ReleaseInfoExample example,
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