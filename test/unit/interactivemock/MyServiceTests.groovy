package interactivemock

import org.apache.solr.client.solrj.SolrServer
import org.apache.solr.client.solrj.request.ContentStreamUpdateRequest

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MyService)
class MyServiceTests {
  void testSomething() {
    def solrServerControl = mockFor(SolrServer), up
    solrServerControl.demand.request { ContentStreamUpdateRequest req -> up = req }
    def service = new MyService(solrServer: solrServerControl.createMock())
    service.serviceMethod()
    assert up instanceof ContentStreamUpdateRequest
  }
}
