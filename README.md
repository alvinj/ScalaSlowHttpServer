# ScalaSlowSocketServer

I created this project so I can test some HTTP(S) and JSON code. The only purpose of this server is to let me control the delay time in the server response to make sure my client code handles that properly.

## Usage

These examples show how to write some client code with `curl`:

```sh
$ curl http://localhost:5150
Have a nice day!

$ curl --head http://localhost:5150
HTTP/1.1 200 OK
Date: Fri Dec 04 10:38:05 MST 2020
Server: SlowServer
Content-Type: text/plain
Delay-Time: 1000 ms
Connection: Closed
```

Notice that the `head` request shows the server delay time.


## Other resources

- Many moons ago I used this [online “slowwly” service](http://slowwly.robertomurray.co.uk/)
- [This article about a Go server](https://adrianhesketh.com/2016/12/03/testing-slow-http-responses/) mentions something I didn’t include: the delay time between the server sending its first byte and its last byte

