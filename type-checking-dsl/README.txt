cd staticbuilder
gradle build
groovyConsole -cp build/libs/staticbuilder.jar

paste
---------------------------------------------------------------------
@groovyx.transform.StaticMarkupBuilder
class Builder {
   static schema = {
       html {
           head {
               title()
           }
           body(allowText:true) {
               p(allowText: true)
               a(allowText: true, attributes:['href', 'target'])
           }
       }
   }
}
---------------------------------------------------------------------

[Script] -> [Inspect Ast]