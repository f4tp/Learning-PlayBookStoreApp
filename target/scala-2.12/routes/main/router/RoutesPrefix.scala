// @GENERATOR:play-routes-compiler
// @SOURCE:F:/My Documents/Play Projects/BookStoreApp/conf/routes
// @DATE:Sat Apr 28 17:37:47 BST 2018


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
