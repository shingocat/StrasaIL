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

import org.strasa.middleware.model.StudyDesign;
import org.strasa.middleware.model.StudyDesignExample;
import org.strasa.middleware.model.StudyDesignExample.Criteria;
import org.strasa.middleware.model.StudyDesignExample.Criterion;

public class StudyDesignSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studydesign
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String countByExample(StudyDesignExample example) {
		BEGIN();
		SELECT("count(*)");
		FROM("studydesign");
		applyWhere(example, false);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studydesign
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String deleteByExample(StudyDesignExample example) {
		BEGIN();
		DELETE_FROM("studydesign");
		applyWhere(example, false);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studydesign
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String insertSelective(StudyDesign record) {
		BEGIN();
		INSERT_INTO("studydesign");
		if (record.getStudyid() != null) {
			VALUES("studyid", "#{studyid,jdbcType=INTEGER}");
		}
		if (record.getStudysiteid() != null) {
			VALUES("studysiteid", "#{studysiteid,jdbcType=INTEGER}");
		}
		if (record.getTreatmentstructure() != null) {
			VALUES("treatmentstructure",
					"#{treatmentstructure,jdbcType=VARCHAR}");
		}
		if (record.getDesignstructure() != null) {
			VALUES("designstructure", "#{designstructure,jdbcType=VARCHAR}");
		}
		if (record.getPlotsize() != null) {
			VALUES("plotsize", "#{plotsize,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor1() != null) {
			VALUES("designfactor1", "#{designfactor1,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor2() != null) {
			VALUES("designfactor2", "#{designfactor2,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor3() != null) {
			VALUES("designfactor3", "#{designfactor3,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor4() != null) {
			VALUES("designfactor4", "#{designfactor4,jdbcType=VARCHAR}");
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studydesign
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String selectByExample(StudyDesignExample example) {
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT("id");
		} else {
			SELECT("id");
		}
		SELECT("studyid");
		SELECT("studysiteid");
		SELECT("treatmentstructure");
		SELECT("designstructure");
		SELECT("plotsize");
		SELECT("designfactor1");
		SELECT("designfactor2");
		SELECT("designfactor3");
		SELECT("designfactor4");
		FROM("studydesign");
		applyWhere(example, false);
		if (example != null && example.getOrderByClause() != null) {
			ORDER_BY(example.getOrderByClause());
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studydesign
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		StudyDesign record = (StudyDesign) parameter.get("record");
		StudyDesignExample example = (StudyDesignExample) parameter
				.get("example");
		BEGIN();
		UPDATE("studydesign");
		if (record.getId() != null) {
			SET("id = #{record.id,jdbcType=INTEGER}");
		}
		if (record.getStudyid() != null) {
			SET("studyid = #{record.studyid,jdbcType=INTEGER}");
		}
		if (record.getStudysiteid() != null) {
			SET("studysiteid = #{record.studysiteid,jdbcType=INTEGER}");
		}
		if (record.getTreatmentstructure() != null) {
			SET("treatmentstructure = #{record.treatmentstructure,jdbcType=VARCHAR}");
		}
		if (record.getDesignstructure() != null) {
			SET("designstructure = #{record.designstructure,jdbcType=VARCHAR}");
		}
		if (record.getPlotsize() != null) {
			SET("plotsize = #{record.plotsize,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor1() != null) {
			SET("designfactor1 = #{record.designfactor1,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor2() != null) {
			SET("designfactor2 = #{record.designfactor2,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor3() != null) {
			SET("designfactor3 = #{record.designfactor3,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor4() != null) {
			SET("designfactor4 = #{record.designfactor4,jdbcType=VARCHAR}");
		}
		applyWhere(example, true);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studydesign
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String updateByExample(Map<String, Object> parameter) {
		BEGIN();
		UPDATE("studydesign");
		SET("id = #{record.id,jdbcType=INTEGER}");
		SET("studyid = #{record.studyid,jdbcType=INTEGER}");
		SET("studysiteid = #{record.studysiteid,jdbcType=INTEGER}");
		SET("treatmentstructure = #{record.treatmentstructure,jdbcType=VARCHAR}");
		SET("designstructure = #{record.designstructure,jdbcType=VARCHAR}");
		SET("plotsize = #{record.plotsize,jdbcType=VARCHAR}");
		SET("designfactor1 = #{record.designfactor1,jdbcType=VARCHAR}");
		SET("designfactor2 = #{record.designfactor2,jdbcType=VARCHAR}");
		SET("designfactor3 = #{record.designfactor3,jdbcType=VARCHAR}");
		SET("designfactor4 = #{record.designfactor4,jdbcType=VARCHAR}");
		StudyDesignExample example = (StudyDesignExample) parameter
				.get("example");
		applyWhere(example, true);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studydesign
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	public String updateByPrimaryKeySelective(StudyDesign record) {
		BEGIN();
		UPDATE("studydesign");
		if (record.getStudyid() != null) {
			SET("studyid = #{studyid,jdbcType=INTEGER}");
		}
		if (record.getStudysiteid() != null) {
			SET("studysiteid = #{studysiteid,jdbcType=INTEGER}");
		}
		if (record.getTreatmentstructure() != null) {
			SET("treatmentstructure = #{treatmentstructure,jdbcType=VARCHAR}");
		}
		if (record.getDesignstructure() != null) {
			SET("designstructure = #{designstructure,jdbcType=VARCHAR}");
		}
		if (record.getPlotsize() != null) {
			SET("plotsize = #{plotsize,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor1() != null) {
			SET("designfactor1 = #{designfactor1,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor2() != null) {
			SET("designfactor2 = #{designfactor2,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor3() != null) {
			SET("designfactor3 = #{designfactor3,jdbcType=VARCHAR}");
		}
		if (record.getDesignfactor4() != null) {
			SET("designfactor4 = #{designfactor4,jdbcType=VARCHAR}");
		}
		WHERE("id = #{id,jdbcType=INTEGER}");
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table studydesign
	 * @mbggenerated  Fri Feb 07 10:48:01 SGT 2014
	 */
	protected void applyWhere(StudyDesignExample example,
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