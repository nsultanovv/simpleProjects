class Contact {
    String name;
    String phone;

    Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Contact c = (Contact) o;
        return name.equals(c.name) && phone.equals(c.phone);
    }

    @Override
    public int hashCode(){
        return name.hashCode() + phone.hashCode();
    }
}
