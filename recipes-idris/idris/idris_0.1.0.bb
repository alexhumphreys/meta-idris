# Copyright (C) 2020 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "A general purpose language with dependent types"
HOMEPAGE = "https://www.idris-lang.org/"
# TODO change
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=4091e2fa52af81d8172e4156b50e7051"
SECTION = "base"
DEPENDS = "chez-native"

inherit devshell

BBCLASSEXTEND = "native"

SRC_URI = "https://www.idris-lang.org/idris2-src/idris2-${PV}.tgz"
SRC_URI[sha256sum] = "86f15cf37a3e5e01a586dc1900f1d89bbc2518b8e4b0d63872255b42b9e0ae24"

S = "${WORKDIR}/idris2-${PV}"

EXTRA_OEMAKE = "'CC=gcc'"
PARALLEL_MAKE = "-j 1"

do_configure() {
}

do_compile() {
  oe_runmake -C dist
  oe_runmake all-fromc
}

do_install(){
  install -d ${D}${bindir}
  install -m 0755 ${B}/idris2 ${D}${bindir}
}
