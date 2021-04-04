# Copyright (C) 2020 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "A general purpose language with dependent types"
HOMEPAGE = "https://www.idris-lang.org/"
# TODO change
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=185a5f8668637c419f2e10b8a4c1e029"
SECTION = "base"
DEPENDS = "chez-native"

inherit devshell

BBCLASSEXTEND = "native"

SRC_URI = "https://www.idris-lang.org/idris2-src/idris2-${PV}.tgz"
SRC_URI[sha256sum] = "5be811e6327d3473dd84d4b498b78ab4046defed1063f28ac60dcd41aa229ec3"

S = "${WORKDIR}/Idris2-${PV}"

EXTRA_OEMAKE = "'CC=gcc'"
PARALLEL_MAKE = "-j 1"

do_configure() {
}

do_compile() {
  oe_runmake bootstrap SCHEME=scheme
  oe_runmake install-support
  oe_runmake install-libs
  # oe_runmake all-fromc
}

do_install(){
  install -d ${D}${bindir}
  install -d ${D}${bindir}/idris2_app
  install -d ${D}${ROOT_HOME}/.idris2/idris2-${PV}/support
  install -m 0755 ${B}/build/exec/idris2 ${D}${bindir}
  install ${B}/build/exec/idris2_app/* ${D}${bindir}/idris2_app
  install ${B}/build/exec/idris2_app/* ${D}${ROOT_HOME}/.idris2
}
