package ejemplorest
import grails.rest.Resource

@Resource
class Empleado {
	long id
	String name
	String lastname
	Date birthday
}
