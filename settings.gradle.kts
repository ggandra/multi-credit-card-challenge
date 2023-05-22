rootProject.name = "multi-credit-card-challenge"

include("domain")
include("server")
include("adapters")

project(":domain").projectDir = File("domain")
project(":server").projectDir = File("server")
project(":adapters").projectDir = File("adapters")
