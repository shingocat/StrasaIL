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
import org.strasa.middleware.model.Segment;
import org.strasa.middleware.model.SegmentExample.Criteria;
import org.strasa.middleware.model.SegmentExample.Criterion;
import org.strasa.middleware.model.SegmentExample;

public class SegmentSqlProvider {

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table segment
     * @mbggenerated  Mon Jul 07 08:49:39 PHT 2014
     */
    public String countByExample(SegmentExample example)
    {
	    BEGIN();
	    SELECT("count(*)");
	    FROM("segment");
	    applyWhere(example, false);
	    return SQL();
    }

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table segment
     * @mbggenerated  Mon Jul 07 08:49:39 PHT 2014
     */
    public String deleteByExample(SegmentExample example)
    {
	    BEGIN();
	    DELETE_FROM("segment");
	    applyWhere(example, false);
	    return SQL();
    }

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table segment
     * @mbggenerated  Mon Jul 07 08:49:39 PHT 2014
     */
    public String insertSelective(Segment record)
    {
	    BEGIN();
	    INSERT_INTO("segment");
	    if (record.getChromosome() != null)
	    {
		    VALUES("chromosome", "#{chromosome,jdbcType=VARCHAR}");
	    }
	    if (record.getRecurrentParent() != null)
	    {
		    VALUES("recurrent_parent", "#{recurrentParent,jdbcType=VARCHAR}");
	    }
	    if (record.getDonorParent() != null)
	    {
		    VALUES("donor_parent", "#{donorParent,jdbcType=VARCHAR}");
	    }
	    if (record.getPosition1() != null)
	    {
		    VALUES("position_1", "#{position1,jdbcType=DECIMAL}");
	    }
	    if (record.getPosition2() != null)
	    {
		    VALUES("position_2", "#{position2,jdbcType=DECIMAL}");
	    }
	    if (record.getPosition3() != null)
	    {
		    VALUES("position_3", "#{position3,jdbcType=DECIMAL}");
	    }
	    if (record.getPosition4() != null)
	    {
		    VALUES("position_4", "#{position4,jdbcType=DECIMAL}");
	    }
	    if (record.getPhysicalStart() != null)
	    {
		    VALUES("physical_start", "#{physicalStart,jdbcType=INTEGER}");
	    }
	    if (record.getPhysicalEnd() != null)
	    {
		    VALUES("physical_end", "#{physicalEnd,jdbcType=INTEGER}");
	    }
	    if (record.getEstimatedLength() != null)
	    {
		    VALUES("estimated_length", "#{estimatedLength,jdbcType=DECIMAL}");
	    }
	    if (record.getMinimumLength() != null)
	    {
		    VALUES("minimum_length", "#{minimumLength,jdbcType=DECIMAL}");
	    }
	    if (record.getMaximumLength() != null)
	    {
		    VALUES("maximum_length", "#{maximumLength,jdbcType=DECIMAL}");
	    }
	    if (record.getDescription() != null)
	    {
		    VALUES("description", "#{description,jdbcType=VARCHAR}");
	    }
	    return SQL();
    }

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table segment
     * @mbggenerated  Mon Jul 07 08:49:39 PHT 2014
     */
    public String selectByExample(SegmentExample example)
    {
	    BEGIN();
	    if (example != null && example.isDistinct())
	    {
		    SELECT_DISTINCT("segment_id");
	    } else
	    {
		    SELECT("segment_id");
	    }
	    SELECT("chromosome");
	    SELECT("recurrent_parent");
	    SELECT("donor_parent");
	    SELECT("position_1");
	    SELECT("position_2");
	    SELECT("position_3");
	    SELECT("position_4");
	    SELECT("physical_start");
	    SELECT("physical_end");
	    SELECT("estimated_length");
	    SELECT("minimum_length");
	    SELECT("maximum_length");
	    SELECT("description");
	    FROM("segment");
	    applyWhere(example, false);
	    if (example != null && example.getOrderByClause() != null)
	    {
		    ORDER_BY(example.getOrderByClause());
	    }
	    return SQL();
    }

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table segment
     * @mbggenerated  Mon Jul 07 08:49:39 PHT 2014
     */
    public String updateByExampleSelective(Map<String, Object> parameter)
    {
	    Segment record = (Segment) parameter.get("record");
	    SegmentExample example = (SegmentExample) parameter.get("example");
	    BEGIN();
	    UPDATE("segment");
	    if (record.getSegmentId() != null)
	    {
		    SET("segment_id = #{record.segmentId,jdbcType=INTEGER}");
	    }
	    if (record.getChromosome() != null)
	    {
		    SET("chromosome = #{record.chromosome,jdbcType=VARCHAR}");
	    }
	    if (record.getRecurrentParent() != null)
	    {
		    SET("recurrent_parent = #{record.recurrentParent,jdbcType=VARCHAR}");
	    }
	    if (record.getDonorParent() != null)
	    {
		    SET("donor_parent = #{record.donorParent,jdbcType=VARCHAR}");
	    }
	    if (record.getPosition1() != null)
	    {
		    SET("position_1 = #{record.position1,jdbcType=DECIMAL}");
	    }
	    if (record.getPosition2() != null)
	    {
		    SET("position_2 = #{record.position2,jdbcType=DECIMAL}");
	    }
	    if (record.getPosition3() != null)
	    {
		    SET("position_3 = #{record.position3,jdbcType=DECIMAL}");
	    }
	    if (record.getPosition4() != null)
	    {
		    SET("position_4 = #{record.position4,jdbcType=DECIMAL}");
	    }
	    if (record.getPhysicalStart() != null)
	    {
		    SET("physical_start = #{record.physicalStart,jdbcType=INTEGER}");
	    }
	    if (record.getPhysicalEnd() != null)
	    {
		    SET("physical_end = #{record.physicalEnd,jdbcType=INTEGER}");
	    }
	    if (record.getEstimatedLength() != null)
	    {
		    SET("estimated_length = #{record.estimatedLength,jdbcType=DECIMAL}");
	    }
	    if (record.getMinimumLength() != null)
	    {
		    SET("minimum_length = #{record.minimumLength,jdbcType=DECIMAL}");
	    }
	    if (record.getMaximumLength() != null)
	    {
		    SET("maximum_length = #{record.maximumLength,jdbcType=DECIMAL}");
	    }
	    if (record.getDescription() != null)
	    {
		    SET("description = #{record.description,jdbcType=VARCHAR}");
	    }
	    applyWhere(example, true);
	    return SQL();
    }

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table segment
     * @mbggenerated  Mon Jul 07 08:49:39 PHT 2014
     */
    public String updateByExample(Map<String, Object> parameter)
    {
	    BEGIN();
	    UPDATE("segment");
	    SET("segment_id = #{record.segmentId,jdbcType=INTEGER}");
	    SET("chromosome = #{record.chromosome,jdbcType=VARCHAR}");
	    SET("recurrent_parent = #{record.recurrentParent,jdbcType=VARCHAR}");
	    SET("donor_parent = #{record.donorParent,jdbcType=VARCHAR}");
	    SET("position_1 = #{record.position1,jdbcType=DECIMAL}");
	    SET("position_2 = #{record.position2,jdbcType=DECIMAL}");
	    SET("position_3 = #{record.position3,jdbcType=DECIMAL}");
	    SET("position_4 = #{record.position4,jdbcType=DECIMAL}");
	    SET("physical_start = #{record.physicalStart,jdbcType=INTEGER}");
	    SET("physical_end = #{record.physicalEnd,jdbcType=INTEGER}");
	    SET("estimated_length = #{record.estimatedLength,jdbcType=DECIMAL}");
	    SET("minimum_length = #{record.minimumLength,jdbcType=DECIMAL}");
	    SET("maximum_length = #{record.maximumLength,jdbcType=DECIMAL}");
	    SET("description = #{record.description,jdbcType=VARCHAR}");
	    SegmentExample example = (SegmentExample) parameter.get("example");
	    applyWhere(example, true);
	    return SQL();
    }

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table segment
     * @mbggenerated  Mon Jul 07 08:49:39 PHT 2014
     */
    public String updateByPrimaryKeySelective(Segment record)
    {
	    BEGIN();
	    UPDATE("segment");
	    if (record.getChromosome() != null)
	    {
		    SET("chromosome = #{chromosome,jdbcType=VARCHAR}");
	    }
	    if (record.getRecurrentParent() != null)
	    {
		    SET("recurrent_parent = #{recurrentParent,jdbcType=VARCHAR}");
	    }
	    if (record.getDonorParent() != null)
	    {
		    SET("donor_parent = #{donorParent,jdbcType=VARCHAR}");
	    }
	    if (record.getPosition1() != null)
	    {
		    SET("position_1 = #{position1,jdbcType=DECIMAL}");
	    }
	    if (record.getPosition2() != null)
	    {
		    SET("position_2 = #{position2,jdbcType=DECIMAL}");
	    }
	    if (record.getPosition3() != null)
	    {
		    SET("position_3 = #{position3,jdbcType=DECIMAL}");
	    }
	    if (record.getPosition4() != null)
	    {
		    SET("position_4 = #{position4,jdbcType=DECIMAL}");
	    }
	    if (record.getPhysicalStart() != null)
	    {
		    SET("physical_start = #{physicalStart,jdbcType=INTEGER}");
	    }
	    if (record.getPhysicalEnd() != null)
	    {
		    SET("physical_end = #{physicalEnd,jdbcType=INTEGER}");
	    }
	    if (record.getEstimatedLength() != null)
	    {
		    SET("estimated_length = #{estimatedLength,jdbcType=DECIMAL}");
	    }
	    if (record.getMinimumLength() != null)
	    {
		    SET("minimum_length = #{minimumLength,jdbcType=DECIMAL}");
	    }
	    if (record.getMaximumLength() != null)
	    {
		    SET("maximum_length = #{maximumLength,jdbcType=DECIMAL}");
	    }
	    if (record.getDescription() != null)
	    {
		    SET("description = #{description,jdbcType=VARCHAR}");
	    }
	    WHERE("segment_id = #{segmentId,jdbcType=INTEGER}");
	    return SQL();
    }

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table segment
     * @mbggenerated  Mon Jul 07 08:49:39 PHT 2014
     */
    protected void applyWhere(SegmentExample example,
            boolean includeExamplePhrase)
    {
	    if (example == null)
	    {
		    return;
	    }
	    String parmPhrase1;
	    String parmPhrase1_th;
	    String parmPhrase2;
	    String parmPhrase2_th;
	    String parmPhrase3;
	    String parmPhrase3_th;
	    if (includeExamplePhrase)
	    {
		    parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
		    parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
		    parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
		    parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
		    parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
		    parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
	    } else
	    {
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
	    for (int i = 0; i < oredCriteria.size(); i++)
	    {
		    Criteria criteria = oredCriteria.get(i);
		    if (criteria.isValid())
		    {
			    if (firstCriteria)
			    {
				    firstCriteria = false;
			    } else
			    {
				    sb.append(" or ");
			    }
			    sb.append('(');
			    List<Criterion> criterions = criteria.getAllCriteria();
			    boolean firstCriterion = true;
			    for (int j = 0; j < criterions.size(); j++)
			    {
				    Criterion criterion = criterions.get(j);
				    if (firstCriterion)
				    {
					    firstCriterion = false;
				    } else
				    {
					    sb.append(" and ");
				    }
				    if (criterion.isNoValue())
				    {
					    sb.append(criterion.getCondition());
				    } else if (criterion.isSingleValue())
				    {
					    if (criterion.getTypeHandler() == null)
					    {
						    sb.append(String.format(parmPhrase1,
						            criterion.getCondition(), i, j));
					    } else
					    {
						    sb.append(String.format(parmPhrase1_th,
						            criterion.getCondition(), i, j,
						            criterion.getTypeHandler()));
					    }
				    } else if (criterion.isBetweenValue())
				    {
					    if (criterion.getTypeHandler() == null)
					    {
						    sb.append(String.format(parmPhrase2,
						            criterion.getCondition(), i, j, i, j));
					    } else
					    {
						    sb.append(String.format(parmPhrase2_th,
						            criterion.getCondition(), i, j,
						            criterion.getTypeHandler(), i, j,
						            criterion.getTypeHandler()));
					    }
				    } else if (criterion.isListValue())
				    {
					    sb.append(criterion.getCondition());
					    sb.append(" (");
					    List<?> listItems = (List<?>) criterion.getValue();
					    boolean comma = false;
					    for (int k = 0; k < listItems.size(); k++)
					    {
						    if (comma)
						    {
							    sb.append(", ");
						    } else
						    {
							    comma = true;
						    }
						    if (criterion.getTypeHandler() == null)
						    {
							    sb.append(String.format(parmPhrase3, i, j, k));
						    } else
						    {
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
	    if (sb.length() > 0)
	    {
		    WHERE(sb.toString());
	    }
    }
}