# scala-library-starter.g8

A *mildly opinionated* Giter8 template for a scala 3 library.  

## Quickstart

1. Create a new, empty GitHub repo, with `main` branch
1. Clone the repo, and run this inside it:
```sh
mill -i init sake92/mill-scala3-library-starter.g8 -o .
```

Enjoy!

## Features

### Build

Simple build for a Scala 3 library.  

If you want to cross build for ScalaJS/ScalaNative, please refer to the [Mill docs](https://mill-build.com/mill/Scala_Build_Examples.html).  
Or simply copy-paste my setup from [Tupson](https://github.com/sake92/tupson/blob/main/build.sc)

### CI

Runs tests on Java 11, 17, 21.

---

### CD
Releasing is done with Java 11.  

Make sure you have credentials for publishing to Sonatype and a GPG key created.  
Before releasing you need to set up the following secrets:
- SONATYPE_USERNAME
- SONATYPE_PASSWORD
- PGP_PASSPHRASE
- PGP_SECRET

Please follow the docs from [mill-ci-release](https://github.com/ckipp01/mill-ci-release?tab=readme-ov-file#gpg)

---

### Docs

Make sure you set up GitHub Pages to use `gh-pages` branch, from root folder `/`

Documentation with [Hepek SSG](https://sake92.github.io/hepek/hepek/index.html) and GitHub Pages deployment

It follows the [DIVIO's Documentation System](https://documentation.divio.com/introduction.html) for structuring the docs in a meaningful way.
