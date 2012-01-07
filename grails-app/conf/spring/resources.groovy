import org.apache.solr.client.solrj.impl.CommonsHttpSolrServer

// Place your Spring DSL code here
beans = {
  solrServer(CommonsHttpSolrServer, 'http://127.0.0.1:8090/solr')
}
