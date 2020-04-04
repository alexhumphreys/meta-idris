# Copyright (C) 2020 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "A general purpose language with dependent types"
HOMEPAGE = "https://www.idris-lang.org/"
# TODO change
LICENSE = "MPL-2.0"
SECTION = "base"
DEPENDS = ""

BBCLASSEXTEND = "native"

SRCREV = "git://github.com/edwinb/Idris2;branch=v0.1.0"

S = "${WORKDIR}/git"

do_install () {
  oe_runmake install-fromc
}
