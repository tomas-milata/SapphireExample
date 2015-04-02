package org.eclipse.sapphire.samples.tomas;

import org.eclipse.sapphire.ElementList;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.ListProperty;
import org.eclipse.sapphire.modeling.annotations.Type;
import org.eclipse.sapphire.modeling.xml.annotations.XmlListBinding;

public interface Derived2 extends Base {

	ElementType TYPE = new ElementType(Derived2.class);

	@Type(base = Next.class)
	@XmlListBinding(mappings = @XmlListBinding.Mapping(element = "next", type = Next.class))
	ListProperty PROP_NEXTS = new ListProperty(TYPE, "Nexts");

	ElementList<Next> getNexts();
	
}
