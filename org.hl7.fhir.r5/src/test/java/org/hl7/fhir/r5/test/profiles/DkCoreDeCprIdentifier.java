package org.hl7.fhir.r5.test.profiles;

import java.util.List;
import java.util.ArrayList;
import javax.annotation.Nullable;
import java.util.Date;


import org.hl7.fhir.r5.context.IWorkerContext;
import org.hl7.fhir.r5.model.*;
import org.hl7.fhir.r5.profilemodel.PEBuilder;
import org.hl7.fhir.r5.profilemodel.PEInstance;
import org.hl7.fhir.r5.profilemodel.PEBuilder.PEElementPropertiesPolicy;
import org.hl7.fhir.r5.profilemodel.gen.PEGeneratedBase;
import org.hl7.fhir.r5.profilemodel.gen.Min;
import org.hl7.fhir.r5.profilemodel.gen.Max;
import org.hl7.fhir.r5.profilemodel.gen.Label;
import org.hl7.fhir.r5.profilemodel.gen.Doco;
import org.hl7.fhir.r5.profilemodel.gen.BindingStrength;
import org.hl7.fhir.r5.profilemodel.gen.ValueSet;
import org.hl7.fhir.r5.profilemodel.gen.MustSupport;
import org.hl7.fhir.r5.profilemodel.gen.Definition;


// Generated by the HAPI Java Profile Generator, 28/10/24, 7:31 am

/**
 * An identifier - identifies some entity uniquely and unambiguously. Typically 
 * this is used for business identifiers.
 *
 */
public class DkCoreDeCprIdentifier extends PEGeneratedBase {

  private static final String CANONICAL_URL = "http://hl7.dk/fhir/core/StructureDefinition/dk-core-d-ecpr-identifier|3.2.0";

  public enum DkCoreDeCPRValueSet {
    URNOID122081761613, // "D-eCPR" = http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes#urn:oid:1.2.208.176.1.6.1.3
    URNOID122081761613177, // "D-eCPR fra Region Sjælland" = http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes#urn:oid:1.2.208.176.1.6.1.3.177
    URNOID122081761613179, // "D-eCPR fra Region Nordjylland" = http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes#urn:oid:1.2.208.176.1.6.1.3.179
    URNOID122081761613181, // "D-eCPR fra Region Midtjylland" = http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes#urn:oid:1.2.208.176.1.6.1.3.181
    URNOID122081761613183, // "D-eCPR fra Region Syddanmark" = http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes#urn:oid:1.2.208.176.1.6.1.3.183
    URNOID122081761613187; // "D-eCPR fra Region Hovedstaden" = http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes#urn:oid:1.2.208.176.1.6.1.3.187

    public static DkCoreDeCPRValueSet fromCode(String s) {
      switch (s) {
      case "urn:oid:1.2.208.176.1.6.1.3": return URNOID122081761613;
      case "urn:oid:1.2.208.176.1.6.1.3.177": return URNOID122081761613177;
      case "urn:oid:1.2.208.176.1.6.1.3.179": return URNOID122081761613179;
      case "urn:oid:1.2.208.176.1.6.1.3.181": return URNOID122081761613181;
      case "urn:oid:1.2.208.176.1.6.1.3.183": return URNOID122081761613183;
      case "urn:oid:1.2.208.176.1.6.1.3.187": return URNOID122081761613187;
      default: return null;
      }
    }

    public static DkCoreDeCPRValueSet fromCoding(Coding c) {
      if ("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes".equals(c.getSystem()) && "urn:oid:1.2.208.176.1.6.1.3".equals(c.getCode())) {
        return URNOID122081761613;
      }
      if ("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes".equals(c.getSystem()) && "urn:oid:1.2.208.176.1.6.1.3.177".equals(c.getCode())) {
        return URNOID122081761613177;
      }
      if ("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes".equals(c.getSystem()) && "urn:oid:1.2.208.176.1.6.1.3.179".equals(c.getCode())) {
        return URNOID122081761613179;
      }
      if ("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes".equals(c.getSystem()) && "urn:oid:1.2.208.176.1.6.1.3.181".equals(c.getCode())) {
        return URNOID122081761613181;
      }
      if ("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes".equals(c.getSystem()) && "urn:oid:1.2.208.176.1.6.1.3.183".equals(c.getCode())) {
        return URNOID122081761613183;
      }
      if ("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes".equals(c.getSystem()) && "urn:oid:1.2.208.176.1.6.1.3.187".equals(c.getCode())) {
        return URNOID122081761613187;
      }
      return null;
    }

    public static DkCoreDeCPRValueSet fromCodeableConcept(CodeableConcept cc) {
      for (Coding c : cc.getCoding()) {
        DkCoreDeCPRValueSet v = fromCoding(c);
        if (v != null) {
          return v;
        }
      }
      return null;
    }

    public String toDisplay() {
      switch (this) {
      case URNOID122081761613: return "D-eCPR";
      case URNOID122081761613177: return "D-eCPR fra Region Sjælland";
      case URNOID122081761613179: return "D-eCPR fra Region Nordjylland";
      case URNOID122081761613181: return "D-eCPR fra Region Midtjylland";
      case URNOID122081761613183: return "D-eCPR fra Region Syddanmark";
      case URNOID122081761613187: return "D-eCPR fra Region Hovedstaden";
      default: return null;
      }
    }

    public String toCode() {
      switch (this) {
      case URNOID122081761613: return "urn:oid:1.2.208.176.1.6.1.3";
      case URNOID122081761613177: return "urn:oid:1.2.208.176.1.6.1.3.177";
      case URNOID122081761613179: return "urn:oid:1.2.208.176.1.6.1.3.179";
      case URNOID122081761613181: return "urn:oid:1.2.208.176.1.6.1.3.181";
      case URNOID122081761613183: return "urn:oid:1.2.208.176.1.6.1.3.183";
      case URNOID122081761613187: return "urn:oid:1.2.208.176.1.6.1.3.187";
      default: return null;
      }
    }

    public Coding toCoding() {
      switch (this) {
      case URNOID122081761613: return new Coding().setSystem("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes").setCode("urn:oid:1.2.208.176.1.6.1.3");
      case URNOID122081761613177: return new Coding().setSystem("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes").setCode("urn:oid:1.2.208.176.1.6.1.3.177");
      case URNOID122081761613179: return new Coding().setSystem("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes").setCode("urn:oid:1.2.208.176.1.6.1.3.179");
      case URNOID122081761613181: return new Coding().setSystem("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes").setCode("urn:oid:1.2.208.176.1.6.1.3.181");
      case URNOID122081761613183: return new Coding().setSystem("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes").setCode("urn:oid:1.2.208.176.1.6.1.3.183");
      case URNOID122081761613187: return new Coding().setSystem("http://hl7.dk/fhir/core/CodeSystem/dk-core-d-ecpr-codes").setCode("urn:oid:1.2.208.176.1.6.1.3.187");
      default: return null;
      }
    }

    public CodeableConcept toCodeableConcept() {
      Coding c = toCoding();
      return c == null ? null : new CodeableConcept().addCoding(c);
    }
  }

  @Min("0") @Max("*") @Doco("Additional content defined by implementations")
  @Definition("May be used to represent additional information that is not part of the basic definition of the element. To make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.")
  private List<Extension> extensions = new ArrayList<>();  // Additional content defined by implementations

  @Min("1") @Max("1") @Doco("The namespace for the identifier value")
  @BindingStrength("required") @ValueSet("http://hl7.dk/fhir/core/ValueSet/DkCoreDeCPRValueSet")
  @Definition("Establishes the namespace for the value - that is, a URL that describes a set values that are unique.")
  private DkCoreDeCPRValueSet system;// @NotNull  // The namespace for the identifier value

  @Min("1") @Max("1") @Doco("The value that is unique")
  @Definition("The portion of the identifier typically relevant to the user and which is unique within the context of the system.")
  private String value;// @NotNull  // The value that is unique

  @Min("0") @Max("1") @Doco("Time period when id is/was valid for use")
  @Definition("Time period during which identifier is/was valid for use.")
  private Period period;  // Time period when id is/was valid for use

  @Min("0") @Max("1") @Doco("Organization that issued id (may be just text)")
  @Definition("Organization that issued/manages the identifier.")
  private Reference assigner;  // Organization that issued id (may be just text)


  /**
   * Parameter-less constructor.
   *
   */
  public DkCoreDeCprIdentifier() {
  }

  /**
   * Used when loading other models 
   *
   */
  public static DkCoreDeCprIdentifier fromSource(PEInstance source) {
    DkCoreDeCprIdentifier theThing = new DkCoreDeCprIdentifier();
    theThing.workerContext = source.getContext();
    theThing.load(source);
    return theThing;
  }

  public void load(PEInstance src) {
    clear();
    for (PEInstance item : src.children("extension")) {
      extensions.add((Extension) item.asDataType());
    }
    if (src.hasChild("system")) {
      system = DkCoreDeCPRValueSet.fromCode(src.child("system").asDataType().primitiveValue());
    }
    if (src.hasChild("value")) {
      value = ((StringType) src.child("value").asDataType()).getValue();
    }
    if (src.hasChild("period")) {
      period = (Period) src.child("period").asDataType();
    }
    if (src.hasChild("assigner")) {
      assigner = (Reference) src.child("assigner").asDataType();
    }

  }

  public void save(PEInstance tgt, boolean nulls) {
    tgt.clear("extension");
    for (Extension item : extensions) {
      tgt.addChild("extension", item);
    }
    tgt.clear("system");
    if (system != null) {
      tgt.addChild("system", system.toCode());
    }
    tgt.clear("value");
    if (value != null) {
      tgt.makeChild("value").data().setProperty("value", new StringType(value));
    }
    tgt.clear("period");
    if (period != null) {
      tgt.addChild("period", period);
    }
    tgt.clear("assigner");
    if (assigner != null) {
      tgt.addChild("assigner", assigner);
    }

  }

  /**
   * An identifier - identifies some entity uniquely and unambiguously. Typically 
   * this is used for business identifiers.
   *
   */
  public List<Extension> getExtensions() {
    if (extensions == null) { extensions = new ArrayList<>(); }
    return extensions;
  }

  public boolean hasExtensions() {
    return extensions != null && !extensions.isEmpty();
  }

  public Extension addExtension() {
    Extension theThing = new Extension();
    getExtensions().add(theThing);
    return theThing;
  }

  public boolean hasExtension(Extension item) {
    return hasExtensions() && extensions.contains(item);
  }

  public void removeExtension(Extension item) {
    if (hasExtension(item)) {
      extensions.remove(item);
    }
  }


  /**
   * An identifier - identifies some entity uniquely and unambiguously. Typically 
   * this is used for business identifiers.
   *
   */
  public DkCoreDeCPRValueSet getSystem() {
    return system;
  }

  public DkCoreDeCprIdentifier setSystem(DkCoreDeCPRValueSet value) {
    this.system = value;
    return this;
  }

  public boolean hasSystem() {
    return system != null;
  }

  /**
   * An identifier - identifies some entity uniquely and unambiguously. Typically 
   * this is used for business identifiers.
   *
   */
  public String getValue() {
    return value;
  }

  public DkCoreDeCprIdentifier setValue(String value) {
    this.value = value;
    return this;
  }

  public boolean hasValue() {
    return value != null;
  }

  /**
   * An identifier - identifies some entity uniquely and unambiguously. Typically 
   * this is used for business identifiers.
   *
   */
  public Period getPeriod() {
    if (period == null) { period = new Period(); }
    return period;
  }

  public DkCoreDeCprIdentifier setPeriod(Period value) {
    this.period = value;
    return this;
  }
  public boolean hasPeriod() {
    return period != null;
  }

  /**
   * An identifier - identifies some entity uniquely and unambiguously. Typically 
   * this is used for business identifiers.
   *
   */
  public Reference getAssigner() {
    if (assigner == null) { assigner = new Reference(); }
    return assigner;
  }

  public DkCoreDeCprIdentifier setAssigner(Reference value) {
    this.assigner = value;
    return this;
  }
  public boolean hasAssigner() {
    return assigner != null;
  }



  public void clear() {
    extensions.clear();
    system = null;
    value = null;
    period = null;
    assigner = null;

  }

}
