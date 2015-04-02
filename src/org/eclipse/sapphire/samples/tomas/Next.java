package org.eclipse.sapphire.samples.tomas;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementReference;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.ReferenceValue;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.Reference;
import org.eclipse.sapphire.modeling.annotations.Required;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

public interface Next extends Element {
	
	ElementType TYPE = new ElementType(Next.class);
	
	@Label( standard = "to" )
	@XmlBinding( path = "to" )
	@Required
	@ElementReference(list = "/Bases", key = "id")
	@Reference(target = Base.class)

	ValueProperty PROP_TO = new ValueProperty( TYPE, "To" );

	ReferenceValue<String, Base> getTo();
	void setTo( String value);

}
