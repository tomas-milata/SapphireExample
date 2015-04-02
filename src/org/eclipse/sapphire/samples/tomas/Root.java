/******************************************************************************
 * Copyright (c) 2014 Oracle
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Shenxue Zhou - initial implementation and ongoing maintenance
 ******************************************************************************/

package org.eclipse.sapphire.samples.tomas;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementList;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.ListProperty;
import org.eclipse.sapphire.modeling.annotations.Type;
import org.eclipse.sapphire.modeling.xml.annotations.XmlListBinding;

public interface Root extends Element {

	ElementType TYPE = new ElementType(Root.class);

	@Type(base = Base.class, possible = { Derived1.class, Derived2.class })
	@XmlListBinding(mappings = { 
			@XmlListBinding.Mapping(element = "derived1", type = Derived1.class),
			@XmlListBinding.Mapping(element = "derived2", type = Derived2.class) 
			})
	ListProperty PROP_BASES = new ListProperty(TYPE, "Bases");

	ElementList<Base> getBases();

}
