package com.bdi.ufrgs.bfoextractor;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Alcides
 */
public class BFOExtractor {

    private static final String BFO_NAMESPACE = "http://purl.obolibrary.org/obo/BFO_";
//    private static final String AGRO_NAMESPACE = "http://purl.obolibrary.org/obo/AGRO_";
//;

    public static void main(String[] args) throws Exception {
//        extractDataset("agro", "ontologies\\Agriculture\\agro.owl", "http://purl.obolibrary.org/obo/AGRO_");;
//        extractDataset("pso", "ontologies\\Agriculture\\pso.owl", "http://purl.obolibrary.org/obo/PSO_");
//        

//        extractDataset("cl", "ontologies\\Anatomy and development\\cl.owl", "http://purl.obolibrary.org/obo/CL_");
//        extractDataset("fbdv", "ontologies\\Anatomy and development\\fbdv.owl", "http://purl.obolibrary.org/obo/FBdv_");
//        extractDataset("plana", "ontologies\\Anatomy and development\\plana.owl", "http://purl.obolibrary.org/obo/PLANA_");
//        extractDataset("uberon", "ontologies\\Anatomy and development\\hsapdv.owl", "http://purl.obolibrary.org/obo/UBERON_");
//        extractDataset("wbls", "ontologies\\Anatomy and development\\wbls.owl", "http://purl.obolibrary.org/obo/WBls_");
//        extractDataset("aism", "ontologies\\Anatomy and development\\aism.owl", "http://purl.obolibrary.org/obo/AISM_");
//        extractDataset("bspo", "ontologies\\Anatomy and development\\bspo.owl", "http://purl.obolibrary.org/obo/BSPO_");
//        extractDataset("caro", "ontologies\\Anatomy and development\\caro.owl", "http://purl.obolibrary.org/obo/CARO_");
//        extractDataset("clao", "ontologies\\Anatomy and development\\clao.owl", "http://purl.obolibrary.org/obo/CLAO_");
//        extractDataset("clo", "ontologies\\Anatomy and development\\clo_merged.owl", "http://purl.obolibrary.org/obo/CLO_");
//        extractDataset("clyh", "ontologies\\Anatomy and development\\clyh.owl", "http://purl.obolibrary.org/obo/CLYH_");
//        extractDataset("colao", "ontologies\\Anatomy and development\\colao.owl", "http://purl.obolibrary.org/obo/COLAO_");
//        extractDataset("cteno", "ontologies\\Anatomy and development\\cteno.owl", "http://purl.obolibrary.org/obo/CTENO_");
//        extractDataset("ecao", "ontologies\\Anatomy and development\\ecao.owl", "http://purl.obolibrary.org/obo/ECAO_");
//        extractDataset("fbbt", "ontologies\\Anatomy and development\\fbbt.owl", "http://purl.obolibrary.org/obo/FBbt_");
//        extractDataset("hsapdv", "ontologies\\Anatomy and development\\hsapdv.owl", "http://purl.obolibrary.org/obo/HsapDv_");
//        extractDataset("hsapdv", "ontologies\\Anatomy and development\\hsapdv.owl", "http://purl.obolibrary.org/obo/HsapDv_");
//        extractDataset("lepao", "ontologies\\Anatomy and development\\lepao.owl", "http://purl.obolibrary.org/obo/LEPAO_");
//        extractDataset("oarcs", "ontologies\\Anatomy and development\\oarcs.owl", "http://purl.obolibrary.org/obo/OARCS_");
//        extractDataset("po", "ontologies\\Anatomy and development\\po.owl", "http://purl.obolibrary.org/obo/PO_");
//        extractDataset("poro", "ontologies\\Anatomy and development\\poro.owl", "http://purl.obolibrary.org/obo/PORO_");
//        extractDataset("wbbt", "ontologies\\Anatomy and development\\wbbt.owl", "http://purl.obolibrary.org/obo/WBbt_");
//        extractDataset("xao", "ontologies\\Anatomy and development\\xenopus_anatomy.owl", "http://purl.obolibrary.org/obo/XAO_");
//        extractDataset("zfa", "ontologies\\Anatomy and development\\zfa.owl", "http://purl.obolibrary.org/obo/ZFA_");
//        extractDataset("zfs", "ontologies\\Anatomy and development\\zfs.owl", "http://purl.obolibrary.org/obo/ZFS_");


//        extractDataset("go", "ontologies\\Biological systems\\go.owl", "http://purl.obolibrary.org/obo/GO_");
//        extractDataset("geno", "ontologies\\Biological systems\\geno.owl", "http://purl.obolibrary.org/obo/GENO_");
//        extractDataset("ino", "ontologies\\Biological systems\\ino_merged.owl", "http://purl.obolibrary.org/obo/INO_");
//        extractDataset("nbo", "ontologies\\Biological systems\\nbo.owl", "http://purl.obolibrary.org/obo/NBO_");
//        extractDataset("nbo", "ontologies\\Biological systems\\nbo.owl", "http://purl.obolibrary.org/obo/NBO_");
//        extractDataset("ogg", "ontologies\\Biological systems\\ogg-merged.owl", "http://purl.obolibrary.org/obo/OGG_");
//        extractDataset("ohpi", "ontologies\\Biological systems\\ohpi.owl", "http://purl.obolibrary.org/obo/OHPI_");
        
//        extractDataset("chebi", "ontologies\\Chemistry and biochemistry\\chebi.owl", "http://purl.obolibrary.org/obo/CHEBI_");
//        extractDataset("cheminf", "ontologies\\Chemistry and biochemistry\\cheminf.owl", "http://semanticscience.org/resource/CHEMINF_");
//        extractDataset("dideo", "ontologies\\Chemistry and biochemistry\\dideo.owl", "http://purl.obolibrary.org/obo/DIDEO_");
//        extractDataset("gno", "ontologies\\Chemistry and biochemistry\\GNOme.owl", "http://purl.obolibrary.org/obo/GNO_");
//        extractDataset("mod", "ontologies\\Chemistry and biochemistry\\PSI-MOD.owl", "http://purl.obolibrary.org/obo/MOD_");
//        extractDataset("mop", "ontologies\\Chemistry and biochemistry\\mop.owl", "http://purl.obolibrary.org/obo/MOP_");
//        extractDataset("omit", "ontologies\\Chemistry and biochemistry\\omit.owl", "http://purl.obolibrary.org/obo/OMIT_");
//        extractDataset("pr", "ontologies\\Chemistry and biochemistry\\pro_reasoned.owl", "http://purl.obolibrary.org/obo/PR_");
//        extractDataset("proco", "ontologies\\Chemistry and biochemistry\\proco.owl", "http://purl.obolibrary.org/obo/PROCO_");
//        extractDataset("rxno", "ontologies\\Chemistry and biochemistry\\rxno.owl", "http://purl.obolibrary.org/obo/RXNO_");
//        extractDataset("rxno", "ontologies\\Chemistry and biochemistry\\rxno.owl", "http://purl.obolibrary.org/obo/RXNO_");
//        extractDataset("txpo", "ontologies\\Chemistry and biochemistry\\txpo.owl", "http://purl.obolibrary.org/obo/TXPO_");


//        extractDataset("cdno", "ontologies\\Diet, metabolomics, and nutrition\\cdno.owl", "http://purl.obolibrary.org/obo/CDNO_");
//        extractDataset("fideo", "ontologies\\Diet, metabolomics, and nutrition\\fideo.owl", "http://purl.obolibrary.org/obo/fideo/FIDEO_");
//        extractDataset("foodon", "ontologies\\Diet, metabolomics, and nutrition\\foodon.owl", "http://purl.obolibrary.org/obo/FOODON_");
//        extractDataset("one", "ontologies\\Diet, metabolomics, and nutrition\\ONE.owl", "http://purl.obolibrary.org/obo/ONE_");
//        extractDataset("ons", "ontologies\\Diet, metabolomics, and nutrition\\ons.owl", "http://purl.obolibrary.org/obo/ONS_");

//        extractDataset("envo", "ontologies\\Environment\\envo.owl", "http://purl.obolibrary.org/obo/ENVO_");
//        extractDataset("ecocore", "ontologies\\Environment\\ecocore.owl", "http://purl.obolibrary.org/obo/ECOCORE_");
//        extractDataset("ecto", "ontologies\\Environment\\ecto.owl", "http://purl.obolibrary.org/obo/ECTO_");
//        extractDataset("geo", "ontologies\\Environment\\geo.owl", "http://purl.obolibrary.org/obo/GEO_");
//        extractDataset("pco", "ontologies\\Environment\\pco.owl", "http://purl.obolibrary.org/obo/PCO_");
//        extractDataset("rbo", "ontologies\\Environment\\rbo.owl", "http://purl.obolibrary.org/obo/RBO_");


//        extractDataset("apollo_sv", "ontologies\\Health\\apollo_sv.owl", "http://purl.obolibrary.org/obo/APOLLO_SV_");
//        extractDataset("doid", "ontologies\\Health\\doid.owl", "http://purl.obolibrary.org/obo/DOID_");
//        extractDataset("maxo", "ontologies\\Health\\maxo.owl", "http://purl.obolibrary.org/obo/MAXO_");
//        extractDataset("mondo", "ontologies\\Health\\mondo.owl", "http://purl.obolibrary.org/obo/MONDO_");
//        extractDataset("omrse", "ontologies\\Health\\omrse.owl", "http://purl.obolibrary.org/obo/OMRSE_");
//        extractDataset("omrse", "ontologies\\Health\\omrse.owl", "http://purl.obolibrary.org/obo/OMRSE_");
//        extractDataset("symp", "ontologies\\Health\\symp.owl", "http://purl.obolibrary.org/obo/SYMP_");
//        extractDataset("trans", "ontologies\\Health\\trans.owl", "http://purl.obolibrary.org/obo/TRANS_");
//        extractDataset("vo", "ontologies\\Health\\vo.owl", "http://purl.obolibrary.org/obo/VO_");
//        extractDataset("ado", "ontologies\\Health\\ado.owl", "http://purl.obolibrary.org/obo/ADO_");
//        extractDataset("chmo", "ontologies\\Health\\chmo.owl", "http://purl.obolibrary.org/obo/CHMO_");
//        extractDataset("cido", "ontologies\\Health\\cido.owl", "http://purl.obolibrary.org/obo/CIDO_");
//        extractDataset("cto", "ontologies\\Health\\cto.owl", "http://purl.obolibrary.org/obo/CTO_");
//        extractDataset("cvdo", "ontologies\\Health\\cvdo.owl", "http://purl.obolibrary.org/obo/CVDO_");
//        extractDataset("dron", "ontologies\\Health\\dron.owl", "http://purl.obolibrary.org/obo/DRON_");
//        extractDataset("genepio", "ontologies\\Health\\genepio.owl", "http://purl.obolibrary.org/obo/GENEPIO_");
//        extractDataset("hso", "ontologies\\Health\\hso.owl", "http://purl.obolibrary.org/obo/HSO_");
//        extractDataset("htn", "ontologies\\Health\\htn.owl", "http://purl.obolibrary.org/obo/HTN_");
//        extractDataset("ido", "ontologies\\Health\\ido.owl", "http://purl.obolibrary.org/obo/IDO_");
//        extractDataset("mf", "ontologies\\Health\\MF.owl", "http://purl.obolibrary.org/obo/MF_");
//        extractDataset("mfoem", "ontologies\\Health\\MFOEM.owl", "http://purl.obolibrary.org/obo/MFOEM_");
//        extractDataset("mfomd", "ontologies\\Health\\MFOMD.owl", "http://purl.obolibrary.org/obo/MFOMD_");
//        extractDataset("mpio", "ontologies\\Health\\mpio.owl", "http://purl.obolibrary.org/obo/MPIO_");
//        extractDataset("oae", "ontologies\\Health\\oae_merged.owl", "http://purl.obolibrary.org/obo/OAE_");
//        extractDataset("ogms", "ontologies\\Health\\ogms.owl", "http://purl.obolibrary.org/obo/OGMS_");
//        extractDataset("ohd", "ontologies\\Health\\ohd.owl", "http://purl.obolibrary.org/obo/OHD_");
//        extractDataset("ontoneo", "ontologies\\Health\\ontoneo.owl", "http://purl.obolibrary.org/obo/ONTONEO_");
//        extractDataset("oostt", "ontologies\\Health\\oostt.owl", "http://purl.obolibrary.org/obo/OOSTT_");
//        extractDataset("ovae", "ontologies\\Health\\ovae_merged.owl", "http://purl.obolibrary.org/obo/OVAE_");
        

//        extractDataset("iao", "ontologies\\Information\\iao.owl", "http://purl.obolibrary.org/obo/IAO_");
//        extractDataset("cio", "ontologies\\Information\\cio.owl", "http://purl.obolibrary.org/obo/CIO_");
//        extractDataset("cro", "ontologies\\Information\\cro.owl", "http://purl.obolibrary.org/obo/CRO_");
//        extractDataset("labo", "ontologies\\Information\\labo.owl", "http://purl.obolibrary.org/obo/LABO_");
//        extractDataset("occo", "ontologies\\Information\\occo.owl", "http://purl.obolibrary.org/obo/OCCO_");
//        extractDataset("pdro", "ontologies\\Information\\pdro.owl", "http://purl.obolibrary.org/obo/PDRO_");
//        extractDataset("psdo", "ontologies\\Information\\psdo.owl", "http://purl.obolibrary.org/obo/PSDO_");
//        extractDataset("t4fs", "ontologies\\Information\\t4fs.owl", "http://purl.obolibrary.org/obo/T4FS_");


//        extractDataset("obcs", "ontologies\\Information technology\\obcs.owl", "http://purl.obolibrary.org/obo/OBCS_");
//        extractDataset("mcro", "ontologies\\Information technology\\mcro.owl", "http://purl.obolibrary.org/obo/MCRO_");
//        extractDataset("stato", "ontologies\\Information technology\\stato.owl", "http://purl.obolibrary.org/obo/STATO_");
//        extractDataset("swo", "ontologies\\Information technology\\swo.owl", "http://www.ebi.ac.uk/swo/SWO_");
        
//        extractDataset("eco", "ontologies\\Investigations\\eco.owl", "http://purl.obolibrary.org/obo/ECO_");
//        extractDataset("obi", "ontologies\\Investigations\\obi.owl", "http://purl.obolibrary.org/obo/OBI_");
//        extractDataset("ico", "ontologies\\Investigations\\ico.owl", "http://purl.obolibrary.org/obo/ICO_");
//        extractDataset("ngbo", "ontologies\\Investigations\\ngbo.owl", "http://purl.obolibrary.org/obo/NGBO_");
//        extractDataset("obib", "ontologies\\Investigations\\obib.owl", "http://purl.obolibrary.org/obo/OBIB_");
//        extractDataset("opmi", "ontologies\\Investigations\\opmi-merged.owl", "http://purl.obolibrary.org/obo/OPMI_");
//        extractDataset("ornaseq", "ontologies\\Investigations\\ornaseq.owl", "http://purl.obolibrary.org/obo/ORNASEQ_");
//        extractDataset("peco", "ontologies\\Investigations\\peco.owl", "http://purl.obolibrary.org/obo/PECO_");
//        extractDataset("sepio", "ontologies\\Investigations\\sepio.owl", "http://purl.obolibrary.org/obo/SEPIO_");
//        extractDataset("sepio", "ontologies\\Investigations\\sepio.owl", "http://purl.obolibrary.org/obo/SEPIO_");
//        extractDataset("slso", "ontologies\\Investigations\\slso.owl", "http://purl.obolibrary.org/obo/SLSO_");

//        extractDataset("iceo", "ontologies\\Microbiology\\iceo_merged.owl", "http://purl.obolibrary.org/obo/ICEO_");
//        extractDataset("hancestro", "ontologies\\Organisms\\hancestro.owl", "http://purl.obolibrary.org/obo/HANCESTRO_");
//        extractDataset("opl", "ontologies\\Organisms\\opl.owl", "http://purl.obolibrary.org/obo/OPL_");
//        extractDataset("vbo", "ontologies\\Organisms\\vbo.owl", "http://purl.obolibrary.org/obo/VBO_");
//        extractDataset("vbo", "ontologies\\Organisms\\vbo.owl", "http://purl.obolibrary.org/obo/VBO_");
//        extractDataset("afpo", "ontologies\\Organisms\\afpo.owl", "http://purl.obolibrary.org/obo/AfPO_");
//        extractDataset("bco", "ontologies\\Organisms\\bco.owl", "http://purl.obolibrary.org/obo/BCO_");
//        extractDataset("gecko", "ontologies\\Organisms\\gecko.owl", "http://purl.obolibrary.org/obo/GECKO_");
//        extractDataset("gsso", "ontologies\\Organisms\\gsso.owl", "http://purl.obolibrary.org/obo/GSSO_");
        extractDataset("ohmi", "ontologies\\Organisms\\ohmi.owl", "http://purl.obolibrary.org/obo/OHMI_");

    }

    public static void extractDataset(String name, String ontologyPath, String namespace) throws Exception {
        File ontologyFile = new File(ontologyPath); // Replace with the AGRO ontology file path
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(ontologyFile);

        // Identify BFO concepts
        Set<OWLClass> bfoConcepts = findConceptsByNamespace(ontology, BFO_NAMESPACE);
        if (bfoConcepts.isEmpty()) {
            System.out.println("No BFO concepts found in the ontology.");
            return;
        }

        // Identify AGRO concepts
        Set<OWLClass> concepts = findConceptsByNamespace(ontology, namespace);
        System.out.println("Concepts identified: " + concepts.size());

        // Initialize a reasoner
        OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
        OWLReasoner reasoner = reasonerFactory.createReasoner(ontology);

        // Prepare the output file
        File outputFile = new File(name + ".csv");
        try (FileWriter writer = new FileWriter(outputFile)) {
            // Write the header
            writer.write("class;term;comment\n");

            // Process AGRO concepts
            System.out.println("Processing " + name + " concepts...");
            for (OWLClass concept : concepts) {
                List<String> labels = sanitizeList(getLabels(concept, ontology));
                List<String> comments = sanitizeList(getComments(concept, ontology));

                // Find the deepest BFO concept
                OWLClass deepestBFOConcept = findDeepestBFOConcept(concept, bfoConcepts, reasoner);
                String bfoClass = null;
                if (deepestBFOConcept != null) {
                    List<String> bfoLabels = getLabels(deepestBFOConcept, ontology);
                    if (!bfoLabels.isEmpty()) {
                        bfoClass = sanitize(bfoLabels.get(0)); // Use the first label
                    }
                }

                // Skip if BFO class is missing
                if (bfoClass == null || bfoClass.isEmpty()) {
                    continue;
                }

                // Write all combinations of labels and comments
                for (String label : labels) {
                    if (label != null && !label.isEmpty()) {
                        if (comments != null && !comments.isEmpty()) {
                            for (String comment : comments) {
                                writer.write(bfoClass + ";" + label + ";" + comment + "\n");
                            }
                        } 
                        else {
                            writer.write(bfoClass + ";" + label + ";" + "" + "\n");
                        }
                    }
                }
            }
        }

        System.out.println("Data has been successfully saved to " + outputFile.getAbsolutePath());
    }

    private static Set<OWLClass> findConceptsByNamespace(OWLOntology ontology, String namespace) {
        Set<OWLClass> concepts = new HashSet<>();
        for (OWLClass cls : ontology.getClassesInSignature()) {
            if (cls.getIRI().toString().startsWith(namespace)) {
                concepts.add(cls);
            }
        }
        return concepts;
    }

    private static boolean isFromNamespace(OWLEntity entity, String namespace) {
        return entity.getIRI().toString().startsWith(namespace);
    }

    private static OWLClass findDeepestBFOConcept(OWLClass domainConcept, Set<OWLClass> bfoConcepts, OWLReasoner reasoner) {
        if (domainConcept == null || bfoConcepts == null || reasoner == null) {
            return null; // Return null if any required parameter is null
        }

        Set<OWLClass> superClasses = reasoner.getSuperClasses(domainConcept, false).getFlattened();
        superClasses.retainAll(bfoConcepts);

        OWLClass deepestBFOConcept = null;
        int maxDepth = -1;

        for (OWLClass bfoConcept : superClasses) {
            int depth = getDepth(bfoConcept, reasoner);
            if (depth > maxDepth) {
                maxDepth = depth;
                deepestBFOConcept = bfoConcept;
            }
        }

        return deepestBFOConcept; // Return the deepest BFO concept or null if none found
    }

    private static int getDepth(OWLClass concept, OWLReasoner reasoner) {
        int depth = 0;
        OWLClass current = concept;
        while (!reasoner.getSuperClasses(current, true).isEmpty()) {
            depth++;
            current = reasoner.getSuperClasses(current, true).getFlattened().iterator().next();
        }
        return depth;
    }

    private static List<String> getLabels(OWLEntity entity, OWLOntology ontology) {
        List<String> labels = new ArrayList<>();
        if (entity == null) {
            return labels; // Return empty list if entity is null
        }
        
        for (OWLAnnotationProperty property : ontology.getAnnotationPropertiesInSignature()) {
            if (property.isLabel()) {
                Set<OWLAnnotationAssertionAxiom> annotations = ontology.getAnnotationAssertionAxioms(entity.getIRI());
                for (OWLAnnotationAssertionAxiom annotation : annotations) {
                    if (annotation.getProperty().equals(property) && annotation.getValue() instanceof OWLLiteral) {
                        labels.add(((OWLLiteral) annotation.getValue()).getLiteral());
                    }
                }
            }
        }
        return labels;
    }

    private static List<String> getComments(OWLEntity entity, OWLOntology ontology) {
        List<String> comments = new ArrayList<>();
        if (entity == null) {
            return comments; // Return empty list if entity is null
        }
        String commentIRI = "http://purl.obolibrary.org/obo/IAO_0000115";
        for (OWLAnnotationProperty property : ontology.getAnnotationPropertiesInSignature()) {
            if (property.getIRI().toString().equals(commentIRI)) {
                Set<OWLAnnotationAssertionAxiom> annotations = ontology.getAnnotationAssertionAxioms(entity.getIRI());
                for (OWLAnnotationAssertionAxiom annotation : annotations) {
                    if (annotation.getProperty().equals(property) && annotation.getValue() instanceof OWLLiteral) {
                        comments.add(((OWLLiteral) annotation.getValue()).getLiteral());
                    }
                }
            }
        }
        return comments;
    }

    private static String sanitize(String input) {
        if (input == null) {
            return null; // Return null if input is null
        }
        input = input.replaceAll(";", ".").replaceAll("_", " ").replaceAll("\\s+", " ");
        return input.trim(); // Remove semicolons, extra spaces
    }

    private static List<String> sanitizeList(List<String> inputList) {
        List<String> sanitized = new ArrayList<>();
        for (String input : inputList) {
            sanitized.add(sanitize(input));
        }
        return sanitized;
    }
}
