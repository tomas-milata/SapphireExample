package org.eclipse.sapphire.samples.tomas;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.Value;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.Required;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

public interface Base extends Element {

	ElementType TYPE = new ElementType(Base.class);
	
	@Label( standard = "id" )
	@XmlBinding( path = "@id" )
	@Required

	ValueProperty PROP_ID = new ValueProperty( TYPE, "Id" );

	Value<String> getId();
	void setId( String id);
}
