# meta-idris

Yocto recipes for [Idris2](https://www.idris-lang.org/), a purely functional programming language with first class types.

## How it works

This has recipes for installing Chez and idris2 on the host machine, and an example recipe to build a "Hello World" idris2 project with the Node backend, then you can run the project on the target machine with:

```
node /usr/lib/hello-idris/hello
```

Take a look at `./recipes-idris/hello-idris/*` for how that gets built and "installed".

## Future work

Ideally both Chez and Idris2 could run on the target machine. Also ideally you could build your idris2 project with the chez or refc backend (and cross compile the refc output for the target), but that could take a while to get working depending on the state of all the idris code generators.
