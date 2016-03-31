import spock.lang.*
import groovyx.net.http.RESTClient
import static groovyx.net.http.ContentType.*

class TestingSpec extends Specification {
  def "Test the JIRA project API"() {
    given:
    def client = new RESTClient( 'http://jira.cas.org/rest/api/2/' )

    when:
    def resp = client.get( path : 'project/13072')

    then:
    resp.status == 200
    resp.data.name == 'SciFinder 2016'

  }
}
