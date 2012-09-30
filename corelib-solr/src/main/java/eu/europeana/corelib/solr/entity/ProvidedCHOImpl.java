/*
 * Copyright 2007-2012 The Europeana Foundation
 *
 *  Licenced under the EUPL, Version 1.1 (the "Licence") and subsequent versions as approved
 *  by the European Commission;
 *  You may not use this work except in compliance with the Licence.
 * 
 *  You may obtain a copy of the Licence at:
 *  http://joinup.ec.europa.eu/software/page/eupl
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the Licence is distributed on an "AS IS" basis, without warranties or conditions of
 *  any kind, either express or implied.
 *  See the Licence for the specific language governing permissions and limitations under
 *  the Licence.
 */

package eu.europeana.corelib.solr.entity;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Property;
import com.google.code.morphia.annotations.Serialized;

import eu.europeana.corelib.definitions.solr.entity.ProvidedCHO;
/**
 * ProvidedCHO (edm:ProvidedCHO) means provided cultural heritage object
 * 
 * @see eu.europeana.corelib.definitions.solr.entity.ProvidedCHO
 * 
 * @author Yorgos.Mamakis@ kb.nl
 */
@JsonSerialize(include = Inclusion.NON_EMPTY)
@Entity("ProvidedCHO")
public class ProvidedCHOImpl extends AbstractEdmEntityImpl implements ProvidedCHO {

	protected String[] owlSameAs;

	@Override
	public String[] getOwlSameAs() {
		return (this.owlSameAs!=null ? this.owlSameAs.clone() : null);
	}

	@Override
	public void setOwlSameAs(String[] owlSameAs) {
		this.owlSameAs = owlSameAs.clone();
	}

	
	@Override
	public boolean equals(Object o) {
		if(o==null){
			return false;
		}
		if(o.getClass() == this.getClass()){
			return this.getAbout().equals(((ProvidedCHOImpl) o).getAbout());
		}
		return false;
	}

	@Override
	public int hashCode(){ 
		return this.about.hashCode();
	}

	
}
