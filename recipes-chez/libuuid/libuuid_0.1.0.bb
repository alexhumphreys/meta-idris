# Copyright (C) 2020 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Dev files for uuid"
# TODO change homepage
HOMEPAGE = "www.example.com"
LICENSE = "BSD-3.0"
LIC_FILES_CHKSUM = "file://${S}/../Documentation/licenses/COPYING.BSD-3-Clause;md5=58dcd8452651fc8b07d1f65ce07ca8af"
SECTION = "base"

BBCLASSEXTEND = "native"

PARALLEL_MAKE = "-j 1"

# TODO change branch
SRCREV = "4189907e6cd9a973c3d6ee9e90f92ed7fd7429bb"
SRC_URI = "git://github.com/karelzak/util-linux;branch=master;protocol=git"

S = "${WORKDIR}/git/libuuid"
