package org.hl7.fhir.convertors.conv10_50;

import org.hl7.fhir.convertors.VersionConvertor_10_50;
import org.hl7.fhir.exceptions.FHIRException;

public class Parameters10_50 {

    public static org.hl7.fhir.r5.model.Parameters convertParameters(org.hl7.fhir.dstu2.model.Parameters src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Parameters tgt = new org.hl7.fhir.r5.model.Parameters();
        VersionConvertor_10_50.copyResource(src, tgt);
        if (src.hasParameter()) {
            for (org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent t : src.getParameter()) tgt.addParameter(convertParametersParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Parameters convertParameters(org.hl7.fhir.r5.model.Parameters src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Parameters tgt = new org.hl7.fhir.dstu2.model.Parameters();
        VersionConvertor_10_50.copyResource(src, tgt);
        if (src.hasParameter()) {
            for (org.hl7.fhir.r5.model.Parameters.ParametersParameterComponent t : src.getParameter()) tgt.addParameter(convertParametersParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent convertParametersParameterComponent(org.hl7.fhir.r5.model.Parameters.ParametersParameterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent tgt = new org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasName()) {
            tgt.setName(src.getName());
        }
        if (src.hasValue()) {
            tgt.setValue(VersionConvertor_10_50.convertType(src.getValue()));
        }
        if (src.hasResource()) {
            tgt.setResource(VersionConvertor_10_50.convertResource(src.getResource()));
        }
        if (src.hasPart()) {
            for (org.hl7.fhir.r5.model.Parameters.ParametersParameterComponent t : src.getPart()) tgt.addPart(convertParametersParameterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Parameters.ParametersParameterComponent convertParametersParameterComponent(org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Parameters.ParametersParameterComponent tgt = new org.hl7.fhir.r5.model.Parameters.ParametersParameterComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasName()) {
            tgt.setName(src.getName());
        }
        if (src.hasValue()) {
            tgt.setValue(VersionConvertor_10_50.convertType(src.getValue()));
        }
        if (src.hasResource()) {
            tgt.setResource(VersionConvertor_10_50.convertResource(src.getResource()));
        }
        if (src.hasPart()) {
            for (org.hl7.fhir.dstu2.model.Parameters.ParametersParameterComponent t : src.getPart()) tgt.addPart(convertParametersParameterComponent(t));
        }
        return tgt;
    }
}
