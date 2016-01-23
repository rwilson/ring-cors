# Ring CORS

Ring middleware for Cross-Origin Resource Sharing. Forked from r0man/ring-cors to improve
disallowed request responses.

## Installation

Via Clojars: https://clojars.org/rwilson/ring-cors

[![Clojars Project](http://clojars.org/rwilson/ring-cors/latest-version.svg)](http://clojars.org/rwilson/ring-cors)

## Usage

    (require '[ring.middleware.cors :refer [wrap-cors]])

    (def handler
      (wrap-cors my-routes :access-control-allow-origin [#"http://example.com"]
                           :access-control-allow-methods [:get :put :post :delete]))

## License

Copyright for portions of ring-ocrs are held by r0man, 2013-2014. All other copyright for ring-cors are
held by Ryan Wilson, 2015.

Distributed under the Eclipse Public License, the same as Clojure.
