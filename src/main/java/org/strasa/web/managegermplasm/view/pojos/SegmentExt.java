/**
 * Builder: Mao Qin
 * Email: mqin@ymail.com
 * Date: 2014 - Jul 1, 2014
 * Project: StrasaWeb
 * Package: org.strasa.web.managegermplasm.view.pojos
 * Name: SegmentExt.java
 */
package org.strasa.web.managegermplasm.view.pojos;

import java.util.List;

import org.strasa.middleware.model.IntrogressionLine;
import org.strasa.middleware.model.Segment;
import org.strasa.middleware.model.enumeration.Homogenous;

public class SegmentExt extends Segment
{
	private String isHomogenous;
	private String owner; // the IL germplasm name;
	private List<IntrogressionLine> harborer; // the list of introgression line harbor this segment;
	
	public SegmentExt()
	{
		
	}
	
	public SegmentExt(Segment s, String isHomogenous, String owner)
	{
		this.setSegmentExtFromSegment(s);
		this.setIsHomogenous(isHomogenous);
		this.setOwner(owner);
	}
	
	public void setSegmentExtFromSegment(Segment s)
	{
		if (s.getSegmentId() != null)
			this.setSegmentId(s.getSegmentId());
		if (s.getChromosome() != null)
			this.setChromosome(s.getChromosome());
		if (s.getPosition1() != null)
			this.setPosition1(s.getPosition1());
		if (s.getPosition2() != null)
			this.setPosition2(s.getPosition2());
		if (s.getPosition3() != null)
			this.setPosition3(s.getPosition3());
		if (s.getPosition4() != null)
			this.setPosition4(s.getPosition4());
		if (s.getRecurrentParent() != null)
			this.setRecurrentParent(s.getRecurrentParent());
		if (s.getDonorParent() != null)
			this.setDonorParent(s.getDonorParent());
		if (s.getEstimatedLength() != null)
			this.setEstimatedLength(s.getEstimatedLength());
		if (s.getMinimumLength() != null)
			this.setMinimumLength(s.getMinimumLength());
		if (s.getMaximumLength() != null)
			this.setMaximumLength(s.getMaximumLength());
		if (s.getPhysicalStart() != null)
			this.setPhysicalStart(s.getPhysicalStart());
		if (s.getPhysicalEnd() != null)
			this.setPhysicalEnd(s.getPhysicalEnd());
		if (s.getDescription() != null)
			this.setDescription(s.getDescription());
	}
	
	public String getIsHomogenous()
	{
		return isHomogenous.equals("YES") ? Homogenous.YES.toString()
		        : Homogenous.NO.toString();
	}
	
	public void setIsHomogenous(String isHomogenous)
	{
		this.isHomogenous = isHomogenous;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	public List<IntrogressionLine> getHarborer() {
		return harborer;
	}

	public void setHarborer(List<IntrogressionLine> harborer) {
		this.harborer = harborer;
	}

	@Override
	public String toString()
	{
		return "SegmentExt [isHomogenous=" + isHomogenous + ", owner=" + owner
		        + "]" + super.toString();
	}
	
}
