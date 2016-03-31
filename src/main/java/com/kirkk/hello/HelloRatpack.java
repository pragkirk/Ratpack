package com.kirkk.hello;

import ratpack.server.RatpackServer;

public class HelloRatpack {
 public static void main(String... args) throws Exception {
   RatpackServer.start(server -> server 
     .handlers(chain -> chain
       .get(ctx -> ctx.render("Hello World!"))
       .get(":name", ctx -> ctx.render("Hello " + ctx.getPathTokens().get("name") + "!"))     
     )
   );
 }
}