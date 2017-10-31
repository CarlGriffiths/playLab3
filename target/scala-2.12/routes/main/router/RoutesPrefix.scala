
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_web/playapps/lab3/conf/routes
// @DATE:Tue Oct 31 12:41:54 GMT 2017


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
