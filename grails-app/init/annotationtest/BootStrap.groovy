package annotationtest

class BootStrap {
    def annotatedBean
    def interfacedBean

    def init = { servletContext ->
        annotatedBean.method()
        interfacedBean.method()
    }
    def destroy = {
        log.error "Destroying ..."
    }
}
