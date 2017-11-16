
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/helloworld/conf/routes
// @DATE:Thu Nov 16 12:23:12 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
