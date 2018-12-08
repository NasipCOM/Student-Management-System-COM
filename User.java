public class User {

  private String name;
  private String surname;
  private int id;
  private int phone;
  private String email;
  private String password;
  private String login;

  public User(String name, String surname, int id, int phone, String email, String password, String login){
      this.name = name;
      this.surname = surname;
      this.id = id;
      this.phone = phone;
      this.email = email;
      this.password = password;
      this.login = login;
  }
  public User(){
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getSurname(){ return surname;
  }
  public void setSurname(String surname){ this.surname = surname;
  }
  public int getId(){ return id;
  }
  public void setId( int id){ this.id = id;
  }
  public int getPhone(){ return phone;
  }
  public void setPhone(int phone){ this.phone = phone;
  }
  public String getEmail(){ return email;
  }
  public void setEmail(){ this.email=email;
  }
  public String getPassword(){ return password;
  }
  public void setPassword(String password){ this.password = password;
  }
  public String setLogin(){ return login;
  }
  public void getLogin(String login){ this.login = login;
  }

  public String toString(){
    return "User{" +
            "name='" + name + '\'' +
            ", surname'" + surname + '\'' +
            ", id=" + id  +
            ", phone=" + phone +
            ", email='" + email + '\'' +
            ", password='" + password + '\''+
            ", login='" + login + '\''+ '}'

    }"
  }

}
