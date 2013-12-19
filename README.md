# ThePieuvre Recommender Client

Client for [The Pieuvre] recommender system

[The Pieuvre]: http://thepieuvre.com


## Requirements

### Thrift

Install Apache [Thrift] 0.9.0 and place the Thrift compiler on your system path.

[Thrift]: http://thrift.apache.org

### Leiningen

[Leiningen] is a build tool for Clojure projects.
Download the 'lein' script and place it on your system path.

[Leiningen]: http://leiningen.org


## Running

Generate Thrift classes:

	lein with-profile thriftc thriftc

Call a Thrift function:

	lein run <function-name> <param1> <param2> ...

   
## Copyright and License

Copyright © 2013 Eric Prunier.

The use and distribution terms for this software are covered by the
[Eclipse Public License 1.0] which can be found in the file
epl-v10.html at the root of this distribution. By using this software
in any fashion, you are agreeing to be bound by the terms of this
license. You must not remove this notice, or any other, from this
software.

[Eclipse Public License 1.0]: http://opensource.org/licenses/eclipse-1.0.php


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/eprunier/thepieuvre-recommender-client/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

