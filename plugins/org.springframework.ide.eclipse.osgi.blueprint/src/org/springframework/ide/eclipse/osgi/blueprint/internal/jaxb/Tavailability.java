//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.05 at 05:47:27 PM CET 
//

package org.springframework.ide.eclipse.osgi.blueprint.internal.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Tavailability.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="Tavailability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="mandatory"/>
 *     &lt;enumeration value="optional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Tavailability")
@XmlEnum
public enum Tavailability {

	@XmlEnumValue("mandatory") MANDATORY("mandatory"), @XmlEnumValue("optional") OPTIONAL("optional");
	private final String value;

	Tavailability(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static Tavailability fromValue(String v) {
		for (Tavailability c : Tavailability.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
