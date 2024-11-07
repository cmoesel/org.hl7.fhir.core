package org.hl7.fhir.r5.test.profiles.codegen;

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


// Generated by the HAPI Java Profile Generator, 5/11/24, 6:00 pm

/**
 * A single issue - either an indication, contraindication, interaction or an 
 * undesirable effect for a medicinal product, medication, device or procedure.
 *
 */
public class ClinicalUseDefinitionWarningUvEpi extends PEGeneratedBase {

  public static final String CANONICAL_URL = "http://hl7.org/fhir/uv/emedicinal-product-info/StructureDefinition/ClinicalUseDefinition-warning-uv-epi|1.0.0";

  @Min("0") @Max("1") @Doco("")
  private String id;  // 

  @Min("0") @Max("*") @Doco("Additional content defined by implementations")
  @Definition("May be used to represent additional information that is not part of the basic definition of the resource. To make the use of extensions safe and managable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.")
  private List<Extension> extensions = new ArrayList<>();  // Additional content defined by implementations

  @Min("0") @Max("*") @Doco("Extensions that cannot be ignored")
  @Definition("May be used to represent additional information that is not part of the basic definition of the resource and that modifies the understanding of the element that contains it and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and managable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.\n\nModifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).")
  private List<Extension> modifierExtensions = new ArrayList<>();  // Extensions that cannot be ignored

  @Min("0") @Max("*") @Doco("Business identifier for this clinical use.")
  @Definition("Business identifier for this issue.")
  private List<Identifier> identifiers = new ArrayList<>();  // Business identifier for this clinical use.

  @Min("1") @Max("1") @Doco("indication | contraindication | interaction | undesirable-effect | warning")
  @BindingStrength("required") @ValueSet("http://hl7.org/fhir/ValueSet/clinical-use-definition-type|5.0.0")
  @Definition("indication | contraindication | interaction | undesirable-effect | warning.")
  private String type;// @NotNull  // indication | contraindication | interaction | undesirable-effect | warning

  @Min("1") @Max("*") @Doco("The medication, product, substance, device, procedure etc. for which this is an indication")
  @Definition("The medication, product, substance, device, procedure etc. for which this is an indication.")
  private List<Reference> subjects = new ArrayList<>();// @NotNull  // The medication, product, substance, device, procedure etc. for which this is an indication

  @Min("0") @Max("*") @Doco("The population group to which this applies")
  @Definition("The population group to which this applies.")
  private List<Reference> populations = new ArrayList<>();  // The population group to which this applies

  @Min("1") @Max("1") @Doco("Critical environmental, health or physical risks or hazards. For example 'Do not operate heavy machinery', 'May cause drowsiness'")
  @Definition("A critical piece of information about environmental, health or physical risks or hazards that serve as caution to the user. For example 'Do not operate heavy machinery', 'May cause drowsiness', or 'Get medical advice/attention if you feel unwell'.")
  private BackboneElement warning;// @NotNull  // Critical environmental, health or physical risks or hazards. For example 'Do not operate heavy machinery', 'May cause drowsiness'


  /**
   * Parameter-less constructor.
   *
   */
  public ClinicalUseDefinitionWarningUvEpi() {
    initFixedValues();
  }

  /**
   * Construct an instance of the object, and fill out all the fixed values 
   *
   */
  public ClinicalUseDefinitionWarningUvEpi(IWorkerContext context) {
    initFixedValues();
    workerContext = context;
    PEBuilder builder = new PEBuilder(context, PEElementPropertiesPolicy.EXTENSION, true);
    PEInstance src = builder.buildPEInstance(CANONICAL_URL, builder.createResource(CANONICAL_URL, false));
    load(src);
  }

  /**
   * Populate an instance of the object based on this source object 
   *
   */
  public static ClinicalUseDefinitionWarningUvEpi fromSource(IWorkerContext context, ClinicalUseDefinition source) {
    ClinicalUseDefinitionWarningUvEpi theThing = new ClinicalUseDefinitionWarningUvEpi();
    theThing.workerContext = context;
    PEBuilder builder = new PEBuilder(context, PEElementPropertiesPolicy.EXTENSION, true);
    PEInstance src = builder.buildPEInstance(CANONICAL_URL, source);
    theThing.load(src);
    return theThing;
  }


  public void load(PEInstance src) {
    clear();
    if (src.hasChild("id")) {
      id = ((IdType) src.child("id").asDataType()).getValue();
    }
    for (PEInstance item : src.children("extension")) {
      extensions.add((Extension) item.asDataType());
    }
    for (PEInstance item : src.children("modifierExtension")) {
      modifierExtensions.add((Extension) item.asDataType());
    }
    for (PEInstance item : src.children("identifier")) {
      identifiers.add((Identifier) item.asDataType());
    }
    if (src.hasChild("type")) {
      type = src.child("type").asDataType().primitiveValue();
    }
    for (PEInstance item : src.children("subject")) {
      subjects.add((Reference) item.asDataType());
    }
    for (PEInstance item : src.children("population")) {
      populations.add((Reference) item.asDataType());
    }
    if (src.hasChild("warning")) {
      warning = (BackboneElement) src.child("warning").asElement();
    }

  }

  /**
   * Build a instance of the underlying object based on this wrapping object 
   *
   */
  public ClinicalUseDefinition build(IWorkerContext context) {
    workerContext = context;
    return build();
  }

  /**
   * Build a instance of the underlying object based on this wrapping object 
   *
   */
  public ClinicalUseDefinition build() {
    ClinicalUseDefinition theThing = new ClinicalUseDefinition();
    PEBuilder builder = new PEBuilder(workerContext, PEElementPropertiesPolicy.EXTENSION, true);
    PEInstance tgt = builder.buildPEInstance(CANONICAL_URL, theThing);
    save(tgt, false);
    return theThing;
  }

  /**
   * Save this profile class into an existing resource (overwriting anything that 
   * exists in the profile) 
   *
   */
  public void save(IWorkerContext context, ClinicalUseDefinition dest, boolean nulls) {
    workerContext = context;
    PEBuilder builder = new PEBuilder(context, PEElementPropertiesPolicy.EXTENSION, true);
    PEInstance tgt = builder.buildPEInstance(CANONICAL_URL, dest);
    save(tgt, nulls);
  }

  public void save(PEInstance tgt, boolean nulls) {
    tgt.clear("id");
    if (id != null) {
      tgt.makeChild("id").data().setProperty("value", new IdType(id));
    }
    tgt.clear("extension");
    for (Extension item : extensions) {
      tgt.addChild("extension", item);
    }
    tgt.clear("modifierExtension");
    for (Extension item : modifierExtensions) {
      tgt.addChild("modifierExtension", item);
    }
    tgt.clear("identifier");
    for (Identifier item : identifiers) {
      tgt.addChild("identifier", item);
    }
    tgt.clear("type");
    if (type != null) {
      tgt.makeChild("type").data().setProperty("value", new CodeType(type));
    }
    tgt.clear("subject");
    for (Reference item : subjects) {
      tgt.addChild("subject", item);
    }
    tgt.clear("population");
    for (Reference item : populations) {
      tgt.addChild("population", item);
    }
    tgt.clear("warning");
    if (warning != null) {
      tgt.addChild("warning", warning);
    }

  }

  private void initFixedValues() {
    type = "warning";

  }

  public String getId() {
    return id;
  }

  public ClinicalUseDefinitionWarningUvEpi setId(String value) {
    this.id = value;
    return this;
  }

  public boolean hasId() {
    return id != null;
  }

  /**
   * May be used to represent additional information that is not part of the basic 
   * definition of the resource. To make the use of extensions safe and managable, 
   * there is a strict set of governance applied to the definition and use of 
   * extensions. Though any implementer can define an extension, there is a set of 
   * requirements that SHALL be met as part of the definition of the extension.
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
   * May be used to represent additional information that is not part of the basic 
   * definition of the resource and that modifies the understanding of the element 
   * that contains it and/or the understanding of the containing element's 
   * descendants. Usually modifier elements provide negation or qualification. To 
   * make the use of extensions safe and managable, there is a strict set of 
   * governance applied to the definition and use of extensions. Though any 
   * implementer is allowed to define an extension, there is a set of requirements 
   * that SHALL be met as part of the definition of the extension. Applications 
   * processing a resource are required to check for modifier extensions.
   *
   * 
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on Resource or 
   * DomainResource (including cannot change the meaning of modifierExtension 
   * itself).
   *
   */
  public List<Extension> getModifierExtensions() {
    if (modifierExtensions == null) { modifierExtensions = new ArrayList<>(); }
    return modifierExtensions;
  }

  public boolean hasModifierExtensions() {
    return modifierExtensions != null && !modifierExtensions.isEmpty();
  }

  public Extension addModifierExtension() {
    Extension theThing = new Extension();
    getModifierExtensions().add(theThing);
    return theThing;
  }

  public boolean hasModifierExtension(Extension item) {
    return hasModifierExtensions() && modifierExtensions.contains(item);
  }

  public void removeModifierExtension(Extension item) {
    if (hasModifierExtension(item)) {
      modifierExtensions.remove(item);
    }
  }


  /**
   * Business identifier for this issue.
   *
   */
  public List<Identifier> getIdentifiers() {
    if (identifiers == null) { identifiers = new ArrayList<>(); }
    return identifiers;
  }

  public boolean hasIdentifiers() {
    return identifiers != null && !identifiers.isEmpty();
  }

  public Identifier addIdentifier() {
    Identifier theThing = new Identifier();
    getIdentifiers().add(theThing);
    return theThing;
  }

  public boolean hasIdentifier(Identifier item) {
    return hasIdentifiers() && identifiers.contains(item);
  }

  public void removeIdentifier(Identifier item) {
    if (hasIdentifier(item)) {
      identifiers.remove(item);
    }
  }


  /**
   * indication | contraindication | interaction | undesirable-effect | warning.
   *
   */
  public String getType() {
    return type;
  }

  public boolean hasType() {
    return true;
  }

  /**
   * The medication, product, substance, device, procedure etc. for which this is an 
   * indication.
   *
   */
  public List<Reference> getSubjects() {
    if (subjects == null) { subjects = new ArrayList<>(); }
    return subjects;
  }

  public boolean hasSubjects() {
    return subjects != null && !subjects.isEmpty();
  }

  public Reference addSubject() {
    Reference theThing = new Reference();
    getSubjects().add(theThing);
    return theThing;
  }

  public boolean hasSubject(Reference item) {
    return hasSubjects() && subjects.contains(item);
  }

  public void removeSubject(Reference item) {
    if (hasSubject(item)) {
      subjects.remove(item);
    }
  }


  /**
   * The population group to which this applies.
   *
   */
  public List<Reference> getPopulations() {
    if (populations == null) { populations = new ArrayList<>(); }
    return populations;
  }

  public boolean hasPopulations() {
    return populations != null && !populations.isEmpty();
  }

  public Reference addPopulation() {
    Reference theThing = new Reference();
    getPopulations().add(theThing);
    return theThing;
  }

  public boolean hasPopulation(Reference item) {
    return hasPopulations() && populations.contains(item);
  }

  public void removePopulation(Reference item) {
    if (hasPopulation(item)) {
      populations.remove(item);
    }
  }


  /**
   * A critical piece of information about environmental, health or physical risks or 
   * hazards that serve as caution to the user. For example 'Do not operate heavy 
   * machinery', 'May cause drowsiness', or 'Get medical advice/attention if you feel 
   * unwell'.
   *
   */
  public @Nullable BackboneElement getWarning() { // BackboneElement is abstract 
    return warning;
  }

  public ClinicalUseDefinitionWarningUvEpi setWarning(BackboneElement value) {
    this.warning = value;
    return this;
  }
  public boolean hasWarning() {
    return warning != null;
  }



  public void clear() {
    id = null;
    extensions.clear();
    modifierExtensions.clear();
    identifiers.clear();
    type = null;
    subjects.clear();
    populations.clear();
    warning = null;

  }

}
