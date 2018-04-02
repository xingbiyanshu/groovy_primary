package entry

class Welcome {

	static main(args) {
		def somebody
		if (args)
			somebody = args
		else
			somebody = "sissi"
		println "Hello $somebody"
	}

}
