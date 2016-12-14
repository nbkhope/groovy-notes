class groovyNotesFive {
  static void main(String[] args) {
    // for the C-style switch,
    // you can also use ranges:
    def age = 13

    switch (age) {
      case 0..6:
        println 'Kid'
        break
      case 7..12:
        println 'Teen'
        break
      case 13..18:
        println 'Almost Adult'
        break
      default:
        println 'Adult'
    }
  }
}
