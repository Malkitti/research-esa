This project contains an implementation of Explicit Semantic Analysis as introduced by Evgeniy Gabrilovich and Shaul Markovitch:

  * **Evgeniy Gabrilovich and Shaul Markovitch**. _Computing Semantic Relatedness using Wikipedia-based Explicit Semantic Analysis._ In Proceedings of IJCAI, 2007.

The implementation is based on the [TERRIER information retrieval framework](http://ir.dcs.gla.ac.uk/terrier/) and supports the following features:

  * build an inverted index of a Wikipedia Database provided in the original MediaWiki database schema
  * compute ESA vectors for any text
  * compute Cosine Similarity of ESA vectors (which can be used as semantic similarity measure)

This software was initially developed at the [Institute AIFB](http://www.aifb.kit.edu), Karlsruhe Institute of Technology. Main author of this software is [Philipp Sorg](http://www.aifb.kit.edu/web/Philipp_Sorg/en).

# Current Version #

**2010-08-16:** Research-ESA 2.0 released. Major changes are:
  * Support for Terrier 3.0
  * New configuration paradigm based on the Spring framework
  * Supports the Research-ESA web service
  * Major bug fixing

# Research-ESA Web service #

The Research-ESA Web service is based on Research-ESA and uses Wikipedia snapshots from September 2009 as knowledge source. It supports the analysis of English, German, French and Spanish text and generates HTML or JSON output of ESA vectors.
  * [Research-ESA Web service description](http://www.multipla-project.org/research-esa)
  * [Research-ESA Web service configurator](http://www.multipla-project.org/research_esa_ui/configurator/)

# Documentation #

  * [Installation](Installation.md)
  * [Tutorial](Tutorial.md)
  * API: Javadoc of the API is included in the source files of the project
  * [Troubleshooting](Troubleshooting.md)

# References #

This framework was used in the following publications:

  * **Philipp Sorg, Philipp Cimiano.** _Cross-lingual Information Retrieval with Explicit Semantic Analysis._ In Working Notes for the CLEF 2008 Workshop, 2008.
  * **Philipp Cimiano, Antje Schulz, Sergej Sizov, Philipp Sorg, Steffen Staab.** _Explicit vs. Latent Concept Models for Cross-Language Information Retrieval._ In Proceedings of the International Joint Conference on Artificial Intelligence (IJCAI), Pasadena, 2009.
  * **Philipp Sorg, Philipp Cimiano.** _An Experimental Comparison of Explicit Semantic Analysis Implementations for Cross-Language Retrieval._ In Proceedings of the International Conference on Applications of Natural Language to Information Systems (NLDB), Saarbrücken, June 2009.

# Contact #

Philipp Sorg<br />
Institute AIFB, Karlsruhe Institut of Technology<br />
Office phone: +49 721 608 44754<br />
Email: [mailto:philipp.sorg@kit.edu](mailto:philipp.sorg@kit.edu)