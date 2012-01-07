package interactivemock

import org.apache.solr.client.solrj.request.ContentStreamUpdateRequest

class MyService {
  def solrServer

  def serviceMethod() {
    solrServer.request(new ContentStreamUpdateRequest())
  }
}
